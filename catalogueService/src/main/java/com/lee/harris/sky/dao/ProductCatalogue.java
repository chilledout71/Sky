package com.lee.harris.sky.dao;

import java.util.List;

import com.lee.harris.sky.beans.Product;

public interface ProductCatalogue {
	

	public List<Product> readProduct(String Location);
}
