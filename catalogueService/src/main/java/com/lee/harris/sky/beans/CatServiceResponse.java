package com.lee.harris.sky.beans;

import java.util.ArrayList;
import java.util.List;
/**
 * object that contains a list of available products
 * @author leeharris
 *
 */
public class CatServiceResponse {
	
	List<Product> availableProducts;

	public List<Product> getAvailableProducts() {
		if (availableProducts==null){
			availableProducts = new ArrayList<Product>();
			
		}
		return availableProducts;
		
	}
}
