package com.shopping.manJb;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {

	private int    pb_num;
	private int    pb_p_num;
	private int    pb_po_num;
	private int    pb_readcount;
	private int    pb_like;
    private String pb_title;
    private String pb_content;
    private String pb_writer;
    private String pb_ip;
    private Date   pb_regdate;
    private String pb_del;
  
}
