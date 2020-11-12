package com.cg.osm.repository;

import java.util.List;

import com.cg.osm.entites.Category;

public interface CategoryRepository {
	
	
	public abstract void addCategory(Category category);
	public abstract void updateCategory(Category category);
	public abstract void cancelCategory(int categoryId);
	public abstract List<Category> showAllCategorys();
	public abstract double calculateTotalCost(int categoryId);
	

}
