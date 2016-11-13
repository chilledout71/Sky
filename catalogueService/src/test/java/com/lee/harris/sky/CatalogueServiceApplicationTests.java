package com.lee.harris.sky;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CatalogueServiceApplication.class)
@WebAppConfiguration
public class CatalogueServiceApplicationTests {


	    @Autowired
	    private WebApplicationContext webApplicationContext;

	    private MockMvc mockMvc;

	    @Autowired
	   private CatalogueServiceImpl service;
		
		@Test
		public void testContextLoad(){
			
			assertNotNull(this.webApplicationContext);
			assertTrue(this.webApplicationContext.containsBean("productCatalogue"));
			assertTrue(this.webApplicationContext.containsBean("catalogueServiceImpl"));
			assertTrue(this.webApplicationContext.containsBean("locationServiceImpl"));
		}
		
		@Test
		public void testLocationSet() {
			 
			mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
			try {
				mockMvc.perform(get("/availableProducts?location=LONDON"))
				  .andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
				  
			} catch (Exception e) {
				fail("exception should not be thrown");
			}
	  
			
		}
		
		@Test
		public void testLocationNotSet() {
			 
			mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
			try {
				mockMvc.perform(get("/availableProducts?location="))
				  .andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
				  
			} catch (Exception e) {
				fail("exception should not be thrown");
			}
	  
			
		}
		
		@Test
		public void testNoLocationParam() {
			 
			mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
			try {
				mockMvc.perform(get("/availableProducts"))
				  .andExpect(status().isBadRequest());
				  
			} catch (Exception e) {
				
				fail("exception should not be thrown");
			}
	  
			
		}
		
		
		
		
}
