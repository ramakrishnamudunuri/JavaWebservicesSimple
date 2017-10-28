package org.rk.webservice;

import java.util.List;

import javax.jws.WebService;

import org.rk.webservice.business.ProductServiceImpl;
import org.rk.webservice.model.Product;

@WebService(endpointInterface="org.rk.webservice.ProductCatalogInterface", portName="TestMartCatalogPort", serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see org.rk.webservice.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return productServiceImpl.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see org.rk.webservice.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return productServiceImpl.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see org.rk.webservice.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product){
		return productServiceImpl.addProduct(category,product);
	}
	
	@Override
	public List<Product> getProductsV2(String category){
		return (List<Product>) productServiceImpl.getProductsV2(category);
	}

}
