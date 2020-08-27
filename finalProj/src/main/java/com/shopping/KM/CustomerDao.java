package com.shopping.KM;

import java.util.Collection;

public interface CustomerDao {
	Customer select(String id);
	int insert(Customer customer);
	Collection<Customer> list();
}
