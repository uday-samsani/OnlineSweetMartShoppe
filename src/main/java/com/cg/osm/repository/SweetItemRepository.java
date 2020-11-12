package com.cg.osm.repository;

import java.util.List;

import com.cg.osm.entites.SweetItem;

public interface SweetItemRepository {

	public abstract void addSweetItem(SweetItem sweetItem);
	
	public abstract void updateSweetItem(SweetItem sweetItem);
	
	public abstract void cancelSweetItem(int sweetItem);
	
	public abstract List<SweetItem> showAllSweetItems();
}
