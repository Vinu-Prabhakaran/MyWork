package com.vinu.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vinu.webservice.business.ProductServiceImpl;
import com.vinu.webservice.model.Product;

//@WebService(name="TestMartCatalog1",portName="TestMartCatalogPort1")
@WebService(endpointInterface="com.vinu.webservice.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.vinu.webservice.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	//@WebMethod(action="Fetch_Categories",operationName="fetchCategories")
	public List<String> getProductCategories(){
		
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see com.vinu.webservice.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see com.vinu.webservice.ProductCatalogInterface#getProducts_v2(java.lang.String)
	 */
	@Override
	public List<Product> getProducts_v2(String Product){
		
		return productService.getProducts_v2(Product);
	}
	
	/* (non-Javadoc)
	 * @see com.vinu.webservice.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category,String item) {
		return(productService.addProduct(category, item));
	}
}
