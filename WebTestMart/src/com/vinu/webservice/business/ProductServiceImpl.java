package com.vinu.webservice.business;

import java.util.ArrayList;
import java.util.List;

import com.vinu.webservice.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
		
	public ProductServiceImpl() {
		super();
		bookList.add("HalfGirlFriend");
		bookList.add("God of Small Things");
		bookList.add("Wings Of Fire");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox JukeBox");
		
		movieList.add("Shrek");
		movieList.add("God Of Small Things");
		movieList.add("Slumdog Millionnaire");
	}

	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Movies");
		categories.add("Music");
		categories.add("Books");
		
		return categories;
	}
	
	public List<String> getProducts(String category){
		
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		default:
			return null;
				
		}
	}
	
	public List<Product> getProducts_v2(String Product){
		
		List<Product> prodList=new ArrayList<>();
		prodList.add(new Product("JavaBrains","1234",1234.56));
		prodList.add(new Product("LetUsC","2334",234.56));
		prodList.add(new Product("LetUsC++","3456",3456.56));
		return prodList;
	}
	
	public boolean addProduct(String category,String item) {
		
		if (!item.isEmpty()) {
			switch (category.toLowerCase()) {
			case "books":
				bookList.add(item);
				break;
			case "music":
				musicList.add(item);
				break;
			case "movies":
				movieList.add(item);
				break;
			default:
				return false;
			}
			return true;
		}
		else {
			return false;
		}
	}
}
