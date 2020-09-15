package com.shopping.manJY;

import java.util.Collection;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private SqlSessionTemplate sst;
	public Collection<Product> list() {
		return sst.selectList("productns.selectList");
	}
	public int delete(String p_num) {
		return sst.delete("productns.delete", p_num);
	}
	public int update(Product product) {
		return sst.update("productns.update", product);
	}
	public int insert(Product product) {
		return sst.insert("productns.insert",product);
	}
}
