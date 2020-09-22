package com.shopping.manJY;
import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
@Data
public class Product {
	 private int p_num;
	 private String p_pc_name;
	 private String p_image;
	 private int p_price;
	 private String p_name;
	 private String p_category;
	 private String p_brand;
	 private String p_size;
	 private String p_discount;
	 private String p_discountrate;
	 private int p_quantity;
	 private int p_like;
	 private Date p_regdate; 
	 // image
	 private MultipartFile file;
}
