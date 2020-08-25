package com.shopping.finalProj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopping.KM.CustomerService;
@Controller
public class HomeController {
	@Autowired
	private CustomerService cs;
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/shop")
	public String shop() {
		return "shop";
	}
}
