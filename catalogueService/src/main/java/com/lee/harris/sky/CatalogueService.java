/**
 * 
 */
package com.lee.harris.sky;

import com.lee.harris.sky.beans.CatServiceRequest;
import com.lee.harris.sky.beans.CatServiceResponse;

/**
 * @author leeharris
 *
 */
public interface CatalogueService {
	
	public CatServiceResponse availableProducts(CatServiceRequest request);

}
