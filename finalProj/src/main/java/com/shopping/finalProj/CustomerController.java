package com.shopping.finalProj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.shopping.KM.Customer;
import com.shopping.KM.CustomerService;
@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	@RequestMapping("joinForm")
	public String joinForm() {
		return "joinForm";
	}
	@RequestMapping(value="idChk",produces="text/html;charset=utf-8")
	@ResponseBody
	public String idChk(String id) {
		String msg = ""; 
		Customer customer = cs.select(id); 
		if (customer == null) msg="사용가능한 ID입니다"; 
		else msg="이미 있으니 다른 ID를 사용하시오";
		return msg;
	}
}
