package com.shopping.manSH;
import java.util.Collection;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BasketDaoImpl implements BasketDao {
	@Autowired
	private SqlSessionTemplate sst;
	public Collection<Basket> list() {
		return sst.selectList("basketns.selectList");
	}
	public Basket select(int ba_num) {
		return sst.selectOne("basketns.select", ba_num);
	}
	public int add(Basket basket) {
		return sst.insert("basketns.add", basket);
	}
	public int update(Basket basket) {
		return sst.update("basketns.update", basket);
	}
	public int delete(int ba_num) {
		return sst.delete("basketns.delete", ba_num);
	}
}
