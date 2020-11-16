package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.SweetItem;

public interface SweetItemService{

	public SweetItem addSweetItem(SweetItem sweetItem);
	
	public SweetItem updateSweetItem(SweetItem sweetItem);
	
	public SweetItem cancelSweetItem(int sweetItem);
	
	public  List<SweetItem> showAllSweetItems();
	
	
}
