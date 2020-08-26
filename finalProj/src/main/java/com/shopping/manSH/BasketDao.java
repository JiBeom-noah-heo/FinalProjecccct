package com.shopping.manSH;
import java.util.Collection;
public interface BasketDao {
	Collection<Basket> list();
	Basket select(int ba_num);
	int add(Basket basket);
	int update(Basket basket);
	int delete(int ba_num);
}
