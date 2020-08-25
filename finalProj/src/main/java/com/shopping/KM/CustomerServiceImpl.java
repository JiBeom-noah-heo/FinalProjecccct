package com.shopping.KM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao cd;
	public Customer select(String id) {
		return cd.select(id);
	}
}
