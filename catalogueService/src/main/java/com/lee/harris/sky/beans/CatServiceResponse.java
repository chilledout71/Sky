package com.lee.harris.sky.beans;

import java.util.ArrayList;
import java.util.List;

public class CatServiceResponse {
	
	List<String> availableProducts;

	public List<String> getAvailableProducts() {
		if (availableProducts==null){
			availableProducts = new ArrayList<String>();
			
		}
		return availableProducts;
		
	}
}
