package com.shopping.manSH;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BasketServiceImpl implements BasketService {
	@Autowired
	private BasketDao bd;
	public Collection<Basket> list() {
		return bd.list();
	}
	public Basket select(int ba_num) {
		return bd.select(ba_num);
	}
	public int add(Basket basket) {
		return bd.add(basket);
	}
	public int update(Basket basket) {
		return bd.update(basket);
	}
	public int delete(int ba_num) {
		return bd.delete(ba_num);
	}
}
