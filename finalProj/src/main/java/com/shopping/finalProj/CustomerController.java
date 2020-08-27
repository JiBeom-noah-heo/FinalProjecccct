package com.shopping.finalProj;
import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.shopping.KM.Customer;
import com.shopping.KM.CustomerService;
@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	@RequestMapping("/joinForm")
	public String joinForm() {
	return "joinForm";
	}
	@RequestMapping(value="idChk",produces="text/html;charset=utf-8")
	@ResponseBody
	public String idChk(String id) {
		String msg = ""; 
		Customer customer = cs.select(id); 
		if (customer == null) {
			msg="사용가능한 ID입니다"; 
		}else {
			msg="이미 있으니 다른 ID를 사용하시오";
		}
		return msg;
	}
	@RequestMapping("/join")
	public String join(Customer customer,Model model){
		int result = 0;
		Customer ct = cs.select(customer.getC_id());
		if (ct == null) {
			result = cs.insert(customer);
		}else{
			result = -1;
		}
		model.addAttribute("result", result);
		return "/customer/join";
	}
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	@RequestMapping("/login")
	public String login(Customer customer, Model model,HttpSession session) {
		int result=0;
		Customer ct=cs.select(customer.getC_id());
		if(ct==null || ct.getC_del().equals("y")) {
			result=-1;
		}else if(ct.getC_password().equals(ct.getC_password())) {
			if(ct.getC_id().equals("master")) {
				result=0;
			}else {
				result =1;
			}
			session.setAttribute("id",ct.getC_id());
		}
		model.addAttribute("result",result);
		return "/customer/login";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "/customer/logout";
	}
	@RequestMapping("/customerList")
	public String customerList(Model model) {
		Collection<Customer> list=cs.list();
		model.addAttribute("list",list);
		return "customerList";
	}
}
