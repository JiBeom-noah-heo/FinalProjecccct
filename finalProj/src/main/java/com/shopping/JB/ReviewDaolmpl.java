package com.shopping.manJB;

import java.util.Collection;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDaolmpl implements ReviewDao {

	@Autowired
	private SqlSessionTemplate sst;
	public Collection<Review> viewList() {
		return sst.selectList("reviews.select");
	}

}
