package com.kuoting.springbootmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kuoting.springbootmall.model.Product;
import com.kuoting.springbootmall.service.ProductService;

@RestController//使前端獲得商品數據
public class ProductController {
	@Autowired
	private ProductService productService;


	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer productId){  //此product值是從url路徑傳過來的
		//為了在此方法裡取得商品數據,就要call service層
		Product product = productService.getProductById(productId);

		if(product!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(product);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

	}
}
