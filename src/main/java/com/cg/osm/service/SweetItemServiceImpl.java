package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.SweetItem;
import com.cg.osm.repository.SweetItemRepository;
import com.cg.osm.repository.SweetItemRepositoryImpl;

public class SweetItemServiceImpl implements SweetItemService{

	private  SweetItemRepository dao;
	
	SweetItemServiceImpl()
	{
		dao = new SweetItemRepositoryImpl();
	}

	public SweetItem addSweetItem(SweetItem sweetItem) {
		SweetItem result = dao.addSweetItem(sweetItem);
		return result;
	}

	public SweetItem updateSweetItem(SweetItem sweetItem) {
		SweetItem result = dao.updateSweetItem(sweetItem);
		return result;
	}

	public SweetItem cancelSweetItem(int sweetItem) {
		SweetItem result = dao.cancelSweetItem(sweetItem);
		return result;
	}

	public List<SweetItem> showAllSweetItems() {
		List<SweetItem> result = dao.showAllSweetItems();
		return result;
	}
	
	
}
