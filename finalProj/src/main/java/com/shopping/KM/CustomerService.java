package com.shopping.KM;

import java.util.Collection;

public interface CustomerService {
	Customer select(String id);
	int insert(Customer customer);
	Collection<Customer> list();
}
