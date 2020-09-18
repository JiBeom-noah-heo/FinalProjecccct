package com.shopping.manJY;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao pd;
	public Collection<Product> list() {
		return pd.list();
	}
	public int delete(String p_num) {
		return pd.delete(p_num);
	}
	public int update(Product product) {
		return pd.update(product);
	}
	public int insert(Product product) {
		return pd.insert(product);
	}
}
