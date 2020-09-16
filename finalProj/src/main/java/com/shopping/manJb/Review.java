package com.shopping.manJb;

import java.sql.Date;

import lombok.Data;

@Data
public class Review {

	private int pbr_num;
    private int pbr_pb_num;
    private int pbr_depth;
    private String pbr_content;
    private String pbr_writer; 
    private String pbr_ip;
    private Date   pbr_regdate;
    private String pbr_del;
  
}
