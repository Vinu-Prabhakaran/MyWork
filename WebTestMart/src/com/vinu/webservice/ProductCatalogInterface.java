package com.vinu.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vinu.webservice.model.Product;

@WebService(name="TestMartCatalog1",portName="TestMartCatalogPort1")
public interface ProductCatalogInterface {
	
	@WebMethod(action="Fetch_Categories",operationName="fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	List<Product> getProducts_v2(String Product);

	@WebMethod
	boolean addProduct(String category, String item);

}