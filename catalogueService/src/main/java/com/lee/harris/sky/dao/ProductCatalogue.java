package com.lee.harris.sky.dao;

import java.util.List;

import com.lee.harris.sky.beans.Product;

public interface ProductCatalogue {
	
	/**
	 * return a List of Products available for the location provided
	 * @param Location
	 * @return
	 */
	public List<Product> readProduct(String Location);
}
