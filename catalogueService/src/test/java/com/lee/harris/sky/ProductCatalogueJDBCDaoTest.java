package com.lee.harris.sky;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.lee.harris.sky.beans.Product;
import com.lee.harris.sky.dao.ProductCatalogueJDBCDAO;

public class ProductCatalogueJDBCDaoTest {

	
	private EmbeddedDatabase db;
	
	@Before
	public void createDummyDatabase(){
	
		db = new EmbeddedDatabaseBuilder()
		.setType(EmbeddedDatabaseType.H2).addScript("createTest.sql").build();
		
			
		
	}
	
	@Test
	public void testReadSportsAvailable() {

		JdbcTemplate template = new JdbcTemplate(db);
		
		ProductCatalogueJDBCDAO dao = new ProductCatalogueJDBCDAO();
		dao.setJdbcTemplate(template);
		
		List<Product> productList = dao.readProduct("LONDON");
		Assert.assertTrue(productList.size()==2);
		Assert.assertTrue(productList.get(0).getCatagory().equals("Sports"));
		Assert.assertTrue(productList.get(0).getName().equals("Arsenal TV"));
		Assert.assertTrue(productList.get(1).getCatagory().equals("News"));
		Assert.assertTrue(productList.get(1).getName().equals("Sky News"));
	
	}
	
	@Test
	public void testReadSportsNotAvailable()
	{
		
	JdbcTemplate template = new JdbcTemplate(db);
		
		ProductCatalogueJDBCDAO dao = new ProductCatalogueJDBCDAO();
		dao.setJdbcTemplate(template);
		
		List<Product> productList = dao.readProduct("SHEFIELD");
		Assert.assertTrue(productList.size()==1);
		Assert.assertTrue(productList.get(0).getCatagory().equals("News"));
		Assert.assertTrue(productList.get(0).getName().equals("Sky News"));
	
	}

}

