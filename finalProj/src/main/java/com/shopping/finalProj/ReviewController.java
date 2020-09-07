package com.shopping.finalProj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopping.JB.Review;
import com.shopping.JB.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService rs;
	@RequestMapping ("/reviewList")
	public String productBoardList (Model model) {
		Collection<Review> list=rs.list();
		model.addAttribute("list",list);
		return "review/productBoardList";
	}
	@RequestMapping (value="/write" , method=RequestMethod.POST)
	public Object write (@RequestParam Map<String, Object> paramMap) {
		Map<String, Object> retVal = new HashMap<String, Object>();
		 
        //패스워드 암호화
        ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
        String password = encoder.encodePassword(paramMap.get("password").toString(), null);
        paramMap.put("password", password);
 
        //정보입력
        int result = ReviewService.regContent(paramMap);
 
        if(result>0){
            retVal.put("code", "OK");
            retVal.put("message", "등록에 성공 하였습니다.");
        }else{
            retVal.put("code", "FAIL");
            retVal.put("message", "등록에 실패 하였습니다.");
        }
 
        return retVal;
	}
}
