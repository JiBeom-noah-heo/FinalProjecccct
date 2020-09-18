package com.shopping.manJb;

import java.util.List;
import java.util.Map;

import com.shopping.manJb.Board;
import com.shopping.manJb.Review;

public interface ReviewService {
 
	int regContent(Map<String, Object> paramMap);
    
    int getContentCnt(Map<String, Object> paramMap);
    
    List<Board> getContentList(Map<String, Object> paramMap);
    
    Board getContentView(Map<String, Object> paramMap);
    
    int regReply(Map<String, Object> paramMap);
    
    List<Review> getReplyList(Map<String, Object> paramMap);
    
    int delReply(Map<String, Object> paramMap);
    
    int getBoardCheck(Map<String, Object> paramMap);
    
    int delBoard(Map<String, Object> paramMap);
        
    boolean checkReply(Map<String, Object> paramMap);
    
    boolean updateReply(Map<String, Object> paramMap);
    
}
 

