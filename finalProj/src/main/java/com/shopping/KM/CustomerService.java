package com.shopping.KM;

public interface CustomerService {
	Customer select(String id);
	int insert(Customer customer);
}
