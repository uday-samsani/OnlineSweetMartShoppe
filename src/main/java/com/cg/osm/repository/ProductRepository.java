package com.cg.osm.repository;

import java.util.List;

import com.cg.osm.entites.Product;

public interface ProductRepository {
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product cancelProduct(int productId);
	public List<Product> showAllProducts(int productId);
	public List<Product> showAllProducts();
}
