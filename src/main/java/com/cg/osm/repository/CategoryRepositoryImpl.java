package com.cg.osm.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.osm.entites.Category;

public class CategoryRepositoryImpl implements CategoryRepository{
	
	private EntityManager entityManager;
	
	public CategoryRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	public Category addCategory(Category category) {
	    entityManager.getTransaction().begin();
	    entityManager.persist(category);
	    entityManager.getTransaction().commit();
		return category;
	}

	public Category updateCategory(Category category) {
		entityManager.getTransaction().begin();
	    entityManager.merge(category);
	    entityManager.getTransaction().commit();
		return category;	
	}

	public Category cancelCategory(int categoryId) {
		entityManager.getTransaction().begin();
	    Category result = entityManager.find(Category.class, categoryId);
	    entityManager.remove(result);
	    entityManager.getTransaction().commit();
		return result;
	}

	public List<Category> showAllCategorys() {
		TypedQuery<Category> querySet = entityManager.createQuery("select c from Category c",Category.class);
		List<Category> categorys = querySet.getResultList();
		return categorys;
	}
}
