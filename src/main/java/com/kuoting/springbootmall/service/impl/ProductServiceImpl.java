package com.kuoting.springbootmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kuoting.springbootmall.dao.ProductDao;
import com.kuoting.springbootmall.model.Product;
import com.kuoting.springbootmall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;	//直接去call ProductDao


	@Override
	public Product getProductById(Integer productId) {
		//直接去call ProductDao
		return productDao.getProductById(productId);
	}


}
