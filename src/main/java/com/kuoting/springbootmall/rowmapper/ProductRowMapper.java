package com.kuoting.springbootmall.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kuoting.springbootmall.constant.ProductCategory;
import com.kuoting.springbootmall.model.Product;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getInt("product_id"));
		product.setProductName(rs.getString("product_name"));
		//product.setCategory(rs.getString("category"));
		//String轉Enum
		String categoryStr = rs.getString("category");
		//根據傳進去的字串的值去找尋對應中的 ProductCategory 中的固定值,然後存放在這個 category 的變數裡面
		ProductCategory category = ProductCategory.valueOf(categoryStr);
		product.setCategory(category);



		product.setImageUrl(rs.getString("image_url"));
		product.setPrice(rs.getInt("price"));
		product.setStock(rs.getInt("stock"));
		product.setDescription(rs.getString("description"));
		product.setCreateDate(rs.getDate("created_date"));
		product.setLastModifiedDate(rs.getTimestamp("last_modified_date"));
		return product;
	}




}
