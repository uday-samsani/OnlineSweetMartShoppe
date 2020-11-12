package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Category;

public interface CategoryService {
	
	
	public abstract void addCategory(Category category);
	public abstract void updateCategory(Category category);
	public abstract void cancelCategory(int categoryId);
	public abstract List<Category> showAllCategorys();
	public abstract double calculateTotalCost(int categoryId);
	

}
