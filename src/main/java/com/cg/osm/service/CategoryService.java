package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Category;

public interface CategoryService {
	
	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public Category cancelCategory(int categoryId);
	public List<Category> showAllCategorys();
	public double calculateTotalCost(int categoryId);

}
