package com.shopping.manSH;

import java.util.Collection;

public interface BasketService {

	Collection<Basket> list();
	Basket select(int ba_num);
	int add(Basket basket);
	int update(Basket basket);
	int delete(int ba_num);

}
