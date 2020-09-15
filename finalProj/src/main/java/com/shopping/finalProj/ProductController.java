package com.shopping.finalProj;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.shopping.manJY.Product;
import com.shopping.manJY.ProductService;
@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	@RequestMapping("/productInsertForm")
	public String productInsertFomr() {
		return "productInsertForm";
	}
	@RequestMapping("/productInsert")
	public String productInsert(Product product,Model model,HttpSession session) throws IOException{
		int result=0;
		String p_image = product.getFile().getOriginalFilename();				
		int fileSize=(int)product.getFile().getSize();
		product.setP_image(p_image);
		String real=session.getServletContext().getRealPath("/resources/upload");
		FileOutputStream fos = 
			new FileOutputStream(new File(real+"/"+p_image));
		fos.write(product.getFile().getBytes());
		fos.close();
		result=ps.insert(product);
		model.addAttribute("fileName", p_image);
		model.addAttribute("fileSize", fileSize);
		model.addAttribute("result",result);
		return "/product/productInsert";
	}
	@RequestMapping("/productList")
	public String productList(Model model) {
		Collection<Product> list = ps.list();
		model.addAttribute("list", list);
		return "productList";
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
