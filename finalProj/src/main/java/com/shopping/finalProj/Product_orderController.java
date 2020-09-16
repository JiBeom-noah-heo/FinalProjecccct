package com.shopping.finalProj;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shopping.man1K.Product_order;
import com.shopping.man1K.Product_orderService;
@Controller
public class Product_orderController {
//	@Autowired
//	private Product_orderService pos;
//	@RequestMapping("/orderList")
//	public String orderList(Model model) {
//		Collection<Product_order> list=pos.selectList();
//		model.addAttribute("list", list);
//		return "orderList";
//	}
//	@RequestMapping("/review")
//	public String review() {
//		return "review";
//	}
//	@RequestMapping("/Perchase")
//	public String perchase() {
//		return "perchase";
//	}
}
