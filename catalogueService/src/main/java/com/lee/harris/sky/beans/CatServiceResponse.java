package com.lee.harris.sky.beans;

import java.util.ArrayList;
import java.util.List;

public class CatServiceResponse {
	
	List<Product> availableProducts;

	public List<Product> getAvailableProducts() {
		if (availableProducts==null){
			availableProducts = new ArrayList<Product>();
			
		}
		return availableProducts;
		
	}
}
