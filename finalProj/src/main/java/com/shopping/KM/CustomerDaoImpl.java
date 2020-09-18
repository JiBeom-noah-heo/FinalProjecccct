package com.shopping.KM;
import java.util.Collection;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SqlSessionTemplate sst;
	public Customer select(String id) {
		return sst.selectOne("customerns.select", id);
	}
	public int insert(Customer customer) {
		return sst.insert("customerns.insert",customer);
	}
	public Collection<Customer> list() {
		return sst.selectList("customerns.selectList");
	}
	public int update(Customer customer) {
		return sst.update("customerns.update",customer);
	}
}
