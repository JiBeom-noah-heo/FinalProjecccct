package com.shopping.finalProj;
import java.util.Collection;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shopping.manJY.Product;
import com.shopping.manJY.ProductService;
@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	@RequestMapping("/productInsertForm")
	public String productInsertForm() {
		return "productInsertForm";
	}
	@RequestMapping("/productInsert")
	public String productInsert(Product product,Model model,HttpSession session){
		int result=0;
		result=ps.insert(product);
		model.addAttribute("result",result);
		return "/product/productInsert";
	}
	@RequestMapping("/productList")
	public String productList(Model model) {
		Collection<Product> list = ps.list();
		model.addAttribute("list", list);
		return "/product/productList";
	}
	@RequestMapping("/productDelete")
	public String productDelete(String p_num, Model model) {
		int result = ps.delete(p_num);
		model.addAttribute("result", result);
		return "/product/productDelete";
	}
	@RequestMapping("/productUpdate")
	public String productUpdate(Product product, Model model) {
		int result = ps.update(product);
		model.addAttribute("result", result);
		return "/product/productUpdate";
	}
}
