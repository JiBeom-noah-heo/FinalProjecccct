package com.shopping.man1K;
import java.util.Collection;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class Product_orderDaoImpl implements Product_orderDao{
	@Autowired
	private SqlSessionTemplate sst;
	public Collection<Product_order> selectList() {
		return sst.selectList("product_orderns");
	}
	
}
