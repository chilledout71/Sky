package com.lee.harris.sky.beans;
/**
 * Object that represents a sky product
 * @author leeharris
 *
 */
public class Product {
	/**
	 * name of the product
	 */
	private String name;
	/**
	 * Category of the product
	 */
	private String catagory;
	/**
	 * location the product is available in
	 */
	private String location;
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Product(String name, String catagory, String location) {
		super();
		this.name = name;
		this.catagory = catagory;
		this.location = location;
	}
	public Product() {
		super();
	}

	public String toString() {
		
		return ("{name: " + name + " ,catagory: " + catagory + " ,location: " +location +"}");
	}
}
