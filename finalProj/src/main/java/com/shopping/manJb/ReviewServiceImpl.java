package com.shopping.manJb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shopping.manJb.BoardDao;
import com.shopping.manJb.Board;
import com.shopping.manJb.Review;
import com.shopping.manJb.ReviewService;

@Service("boardService")
public class ReviewServiceImpl implements ReviewService {

	 @Resource(name="boardDao")
	    private BoardDao boardDao;
	 
	    @Override
	    public int regContent(Map<String, Object> paramMap) {
	        //아이디가 없으면 입력
	        if(paramMap.get("id")==null) {
	            return boardDao.regContent(paramMap);
	        }else {//아이디가 있으면 수정
	            return boardDao.modifyContent(paramMap);
	        }
	    }
	 
	    @Override
	    public int getContentCnt(Map<String, Object> paramMap) {
	        return boardDao.getContentCnt(paramMap);
	    }
	 
	    @Override
	    public List<Board> getContentList(Map<String, Object> paramMap) {
	        return boardDao.getContentList(paramMap);
	    }
	 
	    @Override
	    public Board getContentView(Map<String, Object> paramMap) {
	        return boardDao.getContentView(paramMap);
	    }
	 
	    @Override
	    public int regReply(Map<String, Object> paramMap) {
	        return boardDao.regReply(paramMap);
	    }
	 
	    @Override
	    public List<Review> getReplyList(Map<String, Object> paramMap) {
	 
	        List<Review> boardReplyList = boardDao.getReplyList(paramMap);
	 
	        //msyql 에서 계층적 쿼리가 어려우니 여기서 그냥 해결하자
	 
	        //부모
	        List<Review> boardReplyListParent = new ArrayList<Review>();
	        //자식
	        List<Review> boardReplyListChild = new ArrayList<Review>();
	        //통합
	        List<Review> newBoardReplyList = new ArrayList<Review>();
	 
	        //1.부모와 자식 분리
	        for(Review boardReply: boardReplyList){
	            if(boardReply.getDepth().equals("0")){
	                boardReplyListParent.add(boardReply);
	            }else{
	                boardReplyListChild.add(boardReply);
	            }
	        }
	 
	        //2.부모를 돌린다.
	        for(Review boardReplyParent: boardReplyListParent){
	            //2-1. 부모는 무조건 넣는다.
	            newBoardReplyList.add(boardReplyParent);
	            //3.자식을 돌린다.
	            for(Review boardReplyChild: boardReplyListChild){
	                //3-1. 부모의 자식인 것들만 넣는다.
	                if(boardReplyParent.getReply_id().equals(boardReplyChild.getParent_id())){
	                    newBoardReplyList.add(boardReplyChild);
	                }
	 
	            }
	 
	        }
	 
	        //정리한 list return
	        return newBoardReplyList;
	    }
	 
	    @Override
	    public int delReply(Map<String, Object> paramMap) {
	        return boardDao.delReply(paramMap);
	    }
	 
	    @Override
	    public int getBoardCheck(Map<String, Object> paramMap) {
	        return boardDao.getBoardCheck(paramMap);
	    }
	 
	    @Override
	    public int delBoard(Map<String, Object> paramMap) {
	        return boardDao.delBoard(paramMap);
	    }
	 
	    @Override
	    public boolean checkReply(Map<String, Object> paramMap) {
	        return boardDao.checkReply(paramMap);
	    }
	 
	    @Override
	    public boolean updateReply(Map<String, Object> paramMap) {
	        return boardDao.updateReply(paramMap);
	    }
	 
	}
