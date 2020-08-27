package com.shopping.man1K;

public interface Product_orderDao {
	Product_order select(String id);
	int insert(Product_order product_order);
}
