package com.lee.harris.sky.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.lee.harris.sky.beans.Product;
@Component("productCatalogue") 
public class ProductCatalogueJDBCDAO implements ProductCatalogue {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Product> readProduct(String location) {
		
		
		List<Product> productList = jdbcTemplate.query(
                "SELECT category, product, location FROM products WHERE location = ?", new Object[] { location }
		, (rs, rowNum) -> new Product(rs.getString("category"), rs.getString("product"), rs.getString("location")));
		
		return productList;
	}

}
