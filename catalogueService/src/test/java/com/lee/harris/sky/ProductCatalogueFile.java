package com.lee.harris.sky;

import java.util.ArrayList;
import java.util.List;

import com.lee.harris.sky.beans.Product;
import com.lee.harris.sky.dao.ProductCatalogue;



public class ProductCatalogueFile implements ProductCatalogue {

	@Override
	public List<Product> readProduct(String Location) {
		ArrayList<Product> productList = new ArrayList<Product>();
		
		Product product = new Product();
		product.setCatagory("News");
		product.setName("Sky News");
		productList.add(product);
		
		Product product2 = new Product();
		product2.setCatagory("News");
		product2.setName("Sky Sports News");
		productList.add(product2);
		
		return productList;
	}

}
