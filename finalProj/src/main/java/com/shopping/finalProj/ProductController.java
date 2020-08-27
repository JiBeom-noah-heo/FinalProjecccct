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
import com.shopping.KM.Customer;
import com.shopping.manJY.Product;
import com.shopping.manJY.ProductService;
@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	@RequestMapping("/insert")
	public String upload(@RequestParam("file") MultipartFile mf,
			Customer customer,Model model,HttpSession session) throws IllegalStateException, IOException {
		String fileName = mf.getOriginalFilename();				
		String real=session.getServletContext().getRealPath("/upload");
		FileOutputStream fos = 
			new FileOutputStream(new File(real+"/"+fileName));
		fos.write(mf.getBytes());
		fos.close();
		mf.transferTo(new File("c:/java/"+fileName));
		int fileSize = (int)mf.getSize();
		model.addAttribute("fileName", fileName);
		model.addAttribute("fileize", fileSize);
		return "insert";
	}
	@RequestMapping("productList")
	public String productList(Model model) {
		Collection<Product> list = ps.list();
		model.addAttribute("list", list);
		return "/product/productList";
	}
	@RequestMapping("productDelete")
	public String productDelete(String p_num, Model model) {
		int result = ps.delete(p_num);
		model.addAttribute("result", result);
		return "/product/productDelete";
	}
	@RequestMapping("productUpdate")
	public String productUpdate(Product product, Model model) {
		int result = ps.update(product);
		model.addAttribute("result", result);
		return "/product/productUpdate";
	}
}
