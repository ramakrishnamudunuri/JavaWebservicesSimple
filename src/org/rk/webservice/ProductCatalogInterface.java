package org.rk.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.rk.webservice.model.Product;

@WebService(name="TestMartCatalog", targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_Categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name="Product")
	public abstract List<Product> getProductsV2(String category);

}