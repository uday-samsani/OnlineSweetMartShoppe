package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Category;
import com.cg.osm.repository.CategoryRepository;
import com.cg.osm.repository.CategoryRepositoryImpl;

public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository dao;

	CategoryServiceImpl() {
		dao = new CategoryRepositoryImpl();
	}

	public Category addCategory(Category category) {
		Category result = dao.addCategory(category);
		System.out.println("sop in service");
		return result;
	}

	public Category updateCategory(Category category) {
		Category result = dao.updateCategory(category);
		return result;
	}

	public Category cancelCategory(int categoryId) {
		Category result = dao.cancelCategory(categoryId);
		return result;
	}

	public List<Category> showAllCategorys() {
		List<Category> result = dao.showAllCategorys();
		return result;
	}

	public double calculateTotalCost(int categoryId) {
		return 0;
	}

}
