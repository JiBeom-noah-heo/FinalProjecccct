package com.shopping.man1K;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Product_orderServiceImpl implements Product_orderService{
	@Autowired
	private Product_orderDao pod;
	public Collection<Product_order> selectList() {
		return pod.selectList();
	}
	
}
