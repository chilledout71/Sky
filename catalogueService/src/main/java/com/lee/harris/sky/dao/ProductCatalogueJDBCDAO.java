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
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public List<Product> readProduct(String location) {
		
		
		List<Product> productList = jdbcTemplate.query(
                "SELECT category, product, location FROM products WHERE location = ?", new Object[] { location }
		, (rs, rowNum) -> new Product(rs.getString("product"),rs.getString("category"),  rs.getString("location")));
		
	
		productList.addAll(jdbcTemplate.query(
                "SELECT category, product, location FROM products WHERE location = ?", new Object[] { "" }
		, (rs, rowNum) -> new Product(rs.getString("product"),rs.getString("category"),  rs.getString("location"))));
	
		return productList;
	}
	
	

}
