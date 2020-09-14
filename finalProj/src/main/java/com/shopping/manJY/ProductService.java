package com.shopping.manJY;

import java.util.Collection;

public interface ProductService {
	Collection<Product> list();
	int delete(String p_num);
	int update(Product product);
<<<<<<< HEAD
=======
	int insert(Product product);
>>>>>>> branch 'master' of https://github.com/JiBeom-noah-heo/FinalProjecccct.git
}
