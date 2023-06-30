package com.kuoting.springbootmall.dao;

import com.kuoting.springbootmall.model.Product;

public interface ProductDao {

	//method: find product by id
	Product getProductById(Integer productId);


}
