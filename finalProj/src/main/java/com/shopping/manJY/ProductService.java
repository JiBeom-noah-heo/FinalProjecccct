package com.shopping.manJY;

import java.util.Collection;

public interface ProductService {
	Collection<Product> list();
	int delete(String p_num);
	int update(Product product);


}
