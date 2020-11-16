package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Product;
import com.cg.osm.repository.ProductRepository;
import com.cg.osm.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

	private ProductRepository dao;

	public ProductServiceImpl() {
		dao = new ProductRepositoryImpl();
	}

	public Product addProduct(Product product) {
		Product result = dao.addProduct(product);
		return result;
	}

	public Product updateProduct(Product product) {
		Product result = dao.updateProduct(product);
		return result;
	}

	public Product cancelProduct(int productId) {
		Product result = dao.cancelProduct(productId);
		return result;
	}

	public List<Product> showAllProducts(int productId) {
		List<Product> result = dao.showAllProducts(productId);
		return result;
	}

	public List<Product> showAllProducts() {
		List<Product> result = dao.showAllProducts();
		return result;
	}
}
