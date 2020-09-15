package com.shopping.finalProj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
@Autowired
	@RequestMapping("/home")
	public String home() {
		return "home";
}
	@RequestMapping("/shop")
	public String shop() {
		return "shop";
	}
}
