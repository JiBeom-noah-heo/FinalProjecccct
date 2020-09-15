package com.shopping.man1K;
import java.sql.Date;
import lombok.Data;
@Data
public class Product_order{
		private int po_num;
		private int po_ba_num;
		private String po_ba_c_id;
		private int po_ba_p_num;
		private int po_quantity;
		private String po_size;
		private String po_color;
		private String po_receiver;
		private String po_address;
		private String po_zip;
		private String po_tel;
		private String po_memo;
		private int po_totprice;
		private int po_delivno;
		private String po_delivtype;
		private String po_delivplayer;
		private String po_delivstatus;
		private Date po_purdate;
		private Date po_comdate;
}
