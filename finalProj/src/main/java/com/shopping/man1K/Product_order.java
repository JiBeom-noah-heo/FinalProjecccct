package com.shopping.man1K;

import java.sql.Date;

import lombok.Data;

@Data
public class PRODUCT_order{
		private int Po_num;
		private int Po_ba_num;
		private String Po_ba_c_id;
		private int Po_ba_p_num;
		private int Po_quantity;
		private String Po_size;
		private String Po_color;
		private String Po_receiver;
		private String Po_address;
		private String Po_zip;
		private String Po_tel;
		private String Po_memo;
		private int Po_totprice;
		private int Po_delivno;
		private String Po_delivtype;
		private String Po_delivplayer;
		private String Po_delivstatus;
		private Date Po_purdate;
		private Date Po_comdate;
}
