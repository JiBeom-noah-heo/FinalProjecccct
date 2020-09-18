package com.shopping.manJY;

import java.util.Collection;

import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
	Collection<Product> list();
	int delete(String p_num);
	int update(Product product);
	int insert(Product product);
<<<<<<< HEAD
=======
	Product select(String name);
>>>>>>> branch 'master' of https://github.com/JiBeom-noah-heo/FinalProjecccct.git
}
