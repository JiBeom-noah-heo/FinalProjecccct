package com.shopping.manSH;
import java.sql.Date;
import lombok.Data;
@Data
public class Basket {
	private int ba_num;			// 장바구니 번호
	private String ba_c_id;		// 아이디
	private int ba_p_num;		// 상품 번호
	private int ba_quantity;	// 상품 수량
	private int ba_price;		// 상품 가격
	private String ba_size;		// 상품 사이즈
	private String ba_color;	// 상품 색상
	private String ba_brand;	// 상품 브랜드
	private String ba_category;	// 상품 카테고리
	private Date ba_date;		// 구매일
}
