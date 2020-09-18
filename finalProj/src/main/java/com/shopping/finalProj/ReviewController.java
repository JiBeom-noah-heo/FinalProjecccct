package com.shopping.finalProj;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shopping.manJb.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	private ReviewService rs;

	// 게시글 리스트 조회
	@RequestMapping(value = "/review/reviewList")
	public String boardList(@RequestParam Map<String, Object> paramMap, Model model) {

		// 조회 하려는 페이지
		int startPage = (paramMap.get("startPage") != null ? Integer.parseInt(paramMap.get("startPage").toString())
				: 1);
		// 한페이지에 보여줄 리스트 수
		int visiblePages = (paramMap.get("visiblePages") != null
				? Integer.parseInt(paramMap.get("visiblePages").toString())
				: 10);
		// 일단 전체 건수를 가져온다.
		int totalCnt = rs.getContentCnt(paramMap);


		// 1.하단 페이지 네비게이션에서 보여줄 리스트 수를 구한다.
		BigDecimal decimal1 = new BigDecimal(totalCnt);
		BigDecimal decimal2 = new BigDecimal(visiblePages);
		BigDecimal totalPage = decimal1.divide(decimal2, 0, BigDecimal.ROUND_UP);

		int startLimitPage = 0;


		paramMap.put("start", startLimitPage);


		// ORACLE
		paramMap.put("end", startLimitPage + visiblePages);

		// jsp 에서 보여줄 정보 추출
		model.addAttribute("startPage", startPage + "");// 현재 페이지
		model.addAttribute("totalCnt", totalCnt);// 전체 게시물수
		model.addAttribute("totalPage", totalPage);// 페이지 네비게이션에 보여줄 리스트 수
		model.addAttribute("boardList", rs.getContentList(paramMap));// 검색

		return "reviewList";

	}

	// 게시글 상세 보기
	@RequestMapping(value = "/review/reviewView")
	public String boardView(@RequestParam Map<String, Object> paramMap, Model model) {

		model.addAttribute("reviewList", rs.getReplyList(paramMap));
		model.addAttribute("reviewView", rs.getContentView(paramMap));

		return "boardView";

	}

	// 게시글 등록 및 수정
	@RequestMapping(value = "/review/reviewEdit")
	public String boardEdit(HttpServletRequest request, @RequestParam Map<String, Object> paramMap, Model model) {

		// Referer 검사
		String Referer = request.getHeader("referer");

		if (Referer != null) {// URL로 직접 접근 불가
			if (paramMap.get("pb_num") != null) { // 게시글 수정
				if (Referer.indexOf("/review/reviewView") > -1) {

					// 정보를 가져온다.
					model.addAttribute("reviewView", rs.getContentView(paramMap));
					return "reviewEdit";
				} else {
					return "redirect:/review/reviewList";
				}
			} else { // 게시글 등록
				if (Referer.indexOf("/review/reviewList") > -1) {
					return "reviewEdit";
				} else {
					return "redirect:/review/reviewList";
				}
			}
		} else {
			return "redirect:/review/reviewList";
		}

	}

	// AJAX 호출 (게시글 등록, 수정)
	@RequestMapping(value = "/review/save", method = RequestMethod.POST)
	@ResponseBody
	public Object reviewSave(@RequestParam Map<String, Object> paramMap) {

		// 리턴값
		Map<String, Object> retVal = new HashMap<String, Object>();

		// 패스워드 암호화
		ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
		String password = encoder.encodePassword(paramMap.get("password").toString(), null);
		paramMap.put("password", password);

		// 정보입력
		/* int result = rs.regContent(); */

		if (result > 0) {
			retVal.put("code", "OK");
			retVal.put("message", "등록에 성공 하였습니다.");
		} else {
			retVal.put("code", "FAIL");
			retVal.put("message", "등록에 실패 하였습니다.");
		}

		return retVal;

	}

	// AJAX 호출 (게시글 삭제)
	@RequestMapping(value = "/board/del", method = RequestMethod.POST)
	@ResponseBody
	public Object boardDel(@RequestParam Map<String, Object> paramMap) {

		// 리턴값
		Map<String, Object> retVal = new HashMap<String, Object>();

		// 패스워드 암호화
		ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
		String password = encoder.encodePassword(paramMap.get("password").toString(), null);
		paramMap.put("password", password);

		// 정보입력
		int result = rs.delBoard(paramMap);

		if (result > 0) {
			retVal.put("code", "OK");
		} else {
			retVal.put("code", "FAIL");
			retVal.put("message", "패스워드를 확인해주세요.");
		}

		return retVal;

	}

	// AJAX 호출 (게시글 패스워드 확인)
	@RequestMapping(value = "/board/check", method = RequestMethod.POST)
	@ResponseBody
	public Object boardCheck(@RequestParam Map<String, Object> paramMap) {

		// 리턴값
		Map<String, Object> retVal = new HashMap<String, Object>();

		// 패스워드 암호화
		ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
		String password = encoder.encodePassword(paramMap.get("password").toString(), null);
		paramMap.put("password", password);

		// 정보입력
		int result = rs.getBoardCheck(paramMap);

		if (result > 0) {
			retVal.put("code", "OK");
		} else {
			retVal.put("code", "FAIL");
			retVal.put("message", "패스워드를 확인해주세요.");
		}

		return retVal;

	}

	// AJAX 호출 (댓글 등록)
	@RequestMapping(value = "/board/reply/save", method = RequestMethod.POST)
	@ResponseBody
	public Object boardReplySave(@RequestParam Map<String, Object> paramMap) {

		// 리턴값
		Map<String, Object> retVal = new HashMap<String, Object>();

		// 패스워드 암호화
		ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
		String password = encoder.encodePassword(paramMap.get("reply_password").toString(), null);
		paramMap.put("reply_password", password);

		// 정보입력
		int result = rs.regReply(paramMap);

		if (result > 0) {
			retVal.put("code", "OK");
			retVal.put("reply_id", paramMap.get("reply_id"));
			retVal.put("parent_id", paramMap.get("parent_id"));
			retVal.put("message", "등록에 성공 하였습니다.");
		} else {
			retVal.put("code", "FAIL");
			retVal.put("message", "등록에 실패 하였습니다.");
		}

		return retVal;

	}

	// AJAX 호출 (댓글 삭제)
	@RequestMapping(value = "/board/reply/del", method = RequestMethod.POST)
	@ResponseBody
	public Object boardReplyDel(@RequestParam Map<String, Object> paramMap) {

		// 리턴값
		Map<String, Object> retVal = new HashMap<String, Object>();

		// 패스워드 암호화
		ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
		String password = encoder.encodePassword(paramMap.get("reply_password").toString(), null);
		paramMap.put("reply_password", password);

		// 정보입력
		int result = rs.delReply(paramMap);

		if (result > 0) {
			retVal.put("code", "OK");
		} else {
			retVal.put("code", "FAIL");
			retVal.put("message", "삭제에 실패했습니다. 패스워드를 확인해주세요.");
		}

		return retVal;

	}

	// AJAX 호출 (댓글 패스워드 확인)
	@RequestMapping(value = "/board/reply/check", method = RequestMethod.POST)
	@ResponseBody
	public Object boardReplyCheck(@RequestParam Map<String, Object> paramMap) {

		// 리턴값
		Map<String, Object> retVal = new HashMap<String, Object>();

		// 패스워드 암호화
		ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
		String password = encoder.encodePassword(paramMap.get("reply_password").toString(), null);
		paramMap.put("reply_password", password);

		// 정보입력
		boolean check = rs.checkReply(paramMap);

		if (check) {
			retVal.put("code", "OK");
			retVal.put("reply_id", paramMap.get("reply_id"));
		} else {
			retVal.put("code", "FAIL");
			retVal.put("message", "패스워드를 확인해 주세요.");
		}

		return retVal;

	}

	// AJAX 호출 (댓글 수정)
	@RequestMapping(value = "/board/reply/update", method = RequestMethod.POST)
	@ResponseBody
	public Object boardReplyUpdate(@RequestParam Map<String, Object> paramMap) {

		// 리턴값
		Map<String, Object> retVal = new HashMap<String, Object>();

		// 패스워드 암호화
		ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
		String password = encoder.encodePassword(paramMap.get("reply_password").toString(), null);
		paramMap.put("reply_password", password);

		System.out.println(paramMap);

		// 정보입력
		boolean check = rs.updateReply(paramMap);

		if (check) {
			retVal.put("code", "OK");
			retVal.put("reply_id", paramMap.get("reply_id"));
			retVal.put("message", "수정에 성공 하였습니다.");
		} else {
			retVal.put("code", "FAIL");
			retVal.put("message", "수정에 실패 하였습니다.");
		}

		return retVal;

	}

}
