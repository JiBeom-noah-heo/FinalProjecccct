package com.shopping.KM;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao cd;
	public Customer select(String id) {
		return cd.select(id);
	}
	public int insert(Customer customer) {
		return cd.insert(customer);
	}
	public Collection<Customer> list() {
		return cd.list();
	}
	public int update(Customer customer) {
		return cd.update(customer);
	}
}
