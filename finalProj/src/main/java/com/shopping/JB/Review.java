package com.shopping.manJB;

import java.sql.Date;

import lombok.Data;

@Data
public class Review {
	   private int pb_num;
	   private int pb_p_num ;
	   private String pb_title;
	   private String  pb_content;
	   private String pb_image;
	   private int pb_readcount;
	   private int pb_like;
	   private int pb_ref;
	   private int pb_restep;
	   private int pb_relevel;
	   private String pb_ip ;
	   private Date pb_regdate;
	   private String pb_del;
}
