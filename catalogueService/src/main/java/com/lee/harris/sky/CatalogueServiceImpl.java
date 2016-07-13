/**
 * 
 */
package com.lee.harris.sky;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.lee.harris.sky.beans.CatServiceResponse;
import com.lee.harris.sky.beans.Product;
import com.lee.harris.sky.dao.ProductCatalogue;

/**
 * @author leeharris
 *
 */
@RestController
public class CatalogueServiceImpl implements CatalogueService {
	
	@Autowired
	ProductCatalogue catalogue;
	
	/* (non-Javadoc)
	 * @see com.lee.harris.sky.CatalogueService#availableProducts(com.lee.harris.sky.beans.CatServiceRequest)
	 */
	@Override
	@RequestMapping("/availableProducts")
	public CatServiceResponse availableProducts(@RequestParam("location")String location ) {
		
		CatServiceResponse response = new CatServiceResponse();
		
		ArrayList<Product> productList = (ArrayList<Product>) catalogue.readProduct(location);

		for(Product product:productList)
			response.getAvailableProducts().add(product);
		
		
		
		return response;
	}
	
	@RequestMapping("/testCat")
	public String test(){
		return"This is working ok";
	}

}
