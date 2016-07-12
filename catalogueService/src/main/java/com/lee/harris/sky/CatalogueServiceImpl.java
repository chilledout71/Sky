/**
 * 
 */
package com.lee.harris.sky;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lee.harris.sky.beans.CatServiceRequest;
import com.lee.harris.sky.beans.CatServiceResponse;

/**
 * @author leeharris
 *
 */
@RestController
public class CatalogueServiceImpl implements CatalogueService {

	/* (non-Javadoc)
	 * @see com.lee.harris.sky.CatalogueService#availableProducts(com.lee.harris.sky.beans.CatServiceRequest)
	 */
	@Override
	@RequestMapping("/availableProducts")
	public CatServiceResponse availableProducts(CatServiceRequest request) {
		
		CatServiceResponse response = new CatServiceResponse();
		response.getAvailableProducts().add("product");
		response.getAvailableProducts().add("product2");
		
		
		return response;
	}
	
	@RequestMapping("/testCat")
	public String test(){
		return"This is working ok";
	}

}
