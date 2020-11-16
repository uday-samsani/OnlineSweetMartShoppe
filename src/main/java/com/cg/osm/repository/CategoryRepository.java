package com.cg.osm.repository;

import java.util.List;

import com.cg.osm.entites.Category;

public interface CategoryRepository {
	
	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public Category cancelCategory(int categoryId);
	public List<Category> showAllCategorys();

}
