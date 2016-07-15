package com.lee.harris.sky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CatalogueServiceApplication  implements CommandLineRunner{

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(CatalogueServiceApplication.class, args);

	}
	@Override
	public void run(String... strings) throws Exception {

		System.out.println("***************creating tables***********");
		jdbcTemplate.execute("DROP TABLE products IF EXISTS");
		jdbcTemplate
				.execute("CREATE TABLE products("
						+ "category VARCHAR(25), product VARCHAR(25), location VARCHAR(30))");

		
		
		jdbcTemplate.update("INSERT INTO products(category, product,location) VALUES (?,?,?)","News","Sky News","");
		jdbcTemplate.update("INSERT INTO products(category, product,location) VALUES (?,?,?)","News","Sky Sports News","");
		jdbcTemplate.update("INSERT INTO products(category, product,location) VALUES (?,?,?)","Sports","Arsenal TV","LONDON");
		jdbcTemplate.update("INSERT INTO products(category, product,location) VALUES (?,?,?)","Sports","Chelsea TV","LONDON");
		jdbcTemplate.update("INSERT INTO products(category, product,location) VALUES (?,?,?)","Sports","Liverpool TV","LIVERPOOL");
		
	

	}
}
