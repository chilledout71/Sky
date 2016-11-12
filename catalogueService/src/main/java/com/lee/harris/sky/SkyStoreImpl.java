package com.lee.harris.sky;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SkyStoreImpl implements SkyStore {

	@Override
	
	@RequestMapping(value="html", method = RequestMethod.GET )
	public String skyStore() {
		
		return "index.html";
	}

	
}
