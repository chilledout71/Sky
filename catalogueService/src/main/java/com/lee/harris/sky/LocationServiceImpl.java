/**
 * 
 */
package com.lee.harris.sky;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leeharris
 *
 */

@RestController
public class LocationServiceImpl implements LocationService {

	/* (non-Javadoc)
	 * @see com.lee.harris.sky.LocationService#getLocation(java.lang.String)
	 */
	@Override
	@RequestMapping("/location")
	public String getLocation(@RequestParam("custId")String customerID) {
		
		if(customerID.equals("lonCust")){
			return "LONDON";
		}
		
		if(customerID.equals("liverCust")){
			return "LIVERPOOL";
		}
		
		
		return "";
	}

}
