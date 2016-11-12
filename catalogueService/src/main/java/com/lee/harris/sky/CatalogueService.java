package com.lee.harris.sky;


import com.lee.harris.sky.beans.CatServiceResponse;

/**
 * @author leeharris
 * service interface to return the available products based on location
 *  
 * 
 */
public interface CatalogueService {
/**
 *  	
 * @param request
 * @return {@link CatServiceResponse}
 */
	public CatServiceResponse availableProducts(String location);

}
