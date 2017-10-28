package org.rk.webservice.business;

import java.util.ArrayList;
import java.util.List;

import org.rk.webservice.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl(){
		bookList.add("Book1");
		bookList.add("Book2");
		bookList.add("Book3");
		
		musicList.add("Music1");
		musicList.add("Music2");
		musicList.add("Music3");
		
		movieList.add("Movie1");
		movieList.add("Movie2");
		movieList.add("Movie3");
	}
		
	public List<String> getProducts(String category){
		switch (category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
	
	public List<String> getProductCategories(){
		List<String> categoories = new ArrayList<>();
		categoories.add("Books");
		categoories.add("Music");
		categoories.add("Movies");
		return categoories;
	}	
	
	public boolean addProduct(String category, String product){
		switch (category.toLowerCase()){
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}
	
	public List<Product> getProductsV2(String category){
		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product("Book1","1234",999.99));
		productList.add(new Product("Book2","5678",50.99));
		productList.add(new Product("Book3","9101",100.99));
		
		return productList;
	}
}
