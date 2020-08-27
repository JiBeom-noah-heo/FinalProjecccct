package com.shopping.man1K;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Product_orderDaoImpl {
	@Autowired
	private SqlSessionTemplate sst;
	
}
