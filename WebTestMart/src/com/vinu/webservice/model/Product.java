package com.vinu.webservice.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="Product")
@XmlType(propOrder= {"name","price","sku"})  // to set the order of xml elements
public class Product {
	
	private String name;
	private String sku;
	private double price;
	
	@XmlElement(name="ProdName")  //tag name will be ProdName instead of default which is class variable name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	// A no args constructor is necessary when we use JAXB annotations. For JAXB to instantiate Objects.
	public Product() {
		super();
	}
	
	
	

}
