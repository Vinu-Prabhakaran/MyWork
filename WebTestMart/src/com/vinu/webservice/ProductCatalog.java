package com.vinu.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vinu.webservice.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCategories(){
		
		return productService.getProductCategories();
	}
	
	public List<String> getProducts(String category){
		
		return productService.getProducts(category);
	}
	
	public boolean addProduct(String category,String item) {
		return(productService.addProduct(category, item));
	}
}
