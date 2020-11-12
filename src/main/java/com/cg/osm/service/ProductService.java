package com.cg.osm.service;

<<<<<<< HEAD
public interface ProductService {

=======
import java.util.List;

import com.cg.osm.entites.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product cancelProduct(int productId);
	public List<Product> showAllProducts(int productId);
	public List<Product> showAllProducts();
	
>>>>>>> 7e34940 (Sweet Item)
}
