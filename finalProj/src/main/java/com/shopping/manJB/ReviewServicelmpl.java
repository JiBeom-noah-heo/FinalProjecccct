package com.shopping.manJB;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.KM.Customer;

@Service
public class ReviewServicelmpl implements ReviewService {

	@Autowired
	private ReviewDao pbd;
	public Collection<Review> list() {
		return pbd.viewList();
	}

}
