package com.shopping.KM;

public interface CustomerDao {
	Customer select(String id);
	int insert(Customer customer);
}
