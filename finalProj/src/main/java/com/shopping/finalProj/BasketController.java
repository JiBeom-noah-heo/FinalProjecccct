package com.shopping.finalProj;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shopping.manSH.Basket;
import com.shopping.manSH.BasketService;
@Controller
public class BasketController {
	@Autowired
	private BasketService bs;
	@RequestMapping("/basketList")
	public String basketList(Model model) {
		Collection<Basket> list = bs.list();
		model.addAttribute("list", list);
		return "basketList";
	}
	@RequestMapping("/addBasket")
	public String addBasket(Basket basket, Model model) {
		Basket bskt = bs.select(basket.getBa_num());
		int result = 0;
		if (bskt == null) {
			result = bs.add(basket);
		} else result = -1;
		model.addAttribute("result", result);
		return "addBasket";
	}
	@RequestMapping("/updateBasket")
	public String updateBasket(Basket basket, Model model) {
		int result = bs.update(basket);
		model.addAttribute("result", result);
		return "updateBasket";
	}
	@RequestMapping("/deleteBasket")
	public String deleteBasket(int ba_num, Model model) {
		int result = bs.delete(ba_num);
		model.addAttribute("result", result);
		return "deleteBasket";
	}
}
