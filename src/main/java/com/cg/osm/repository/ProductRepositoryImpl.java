package com.cg.osm.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.osm.entites.Product;

public class ProductRepositoryImpl implements ProductRepository{
	
	private EntityManager entityManager;
	
	public ProductRepositoryImpl(){
		entityManager = JPAUtil.getEntityManager();
	}

	public Product addProduct(Product product) {
		entityManager.getTransaction().begin();
		entityManager.persist(product);
		entityManager.getTransaction().commit();
		return product;
	}

	public Product updateProduct(Product product) {
		entityManager.getTransaction().begin();
		entityManager.merge(product);
		entityManager.getTransaction().commit();
		return product;
	}

	public Product cancelProduct(int productId) {
		entityManager.getTransaction().begin();
		Product result = entityManager.find(Product.class, productId);
		entityManager.remove(result);
		entityManager.getTransaction().commit();
		return result;
	}

	public List<Product> showAllProducts(int productId) {
		TypedQuery<Product> querySet = entityManager.createQuery("select c from Product c where c.productId==productId",Product.class);
		querySet.setParameter("productId", productId);
		List<Product> products = querySet.getResultList();
		return products;
	}

	public List<Product> showAllProducts() {
		TypedQuery<Product> querySet = entityManager.createQuery("select c from Product c",Product.class);		
		List<Product> products = querySet.getResultList();
		return products;
	}
}
