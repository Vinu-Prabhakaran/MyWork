package com.vinu.webservice;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ProductCatalog {
	
	public List<String> getProductCategories(){
		List<String> categories = Arrays.asList("Movies","Music","Books");
		return categories;
	}
}
