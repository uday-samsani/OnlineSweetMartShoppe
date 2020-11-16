package com.cg.osm.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.osm.entites.SweetItem;

public class SweetItemRepositoryImpl implements SweetItemRepository{
	
	private EntityManager entityManager;
	
	public SweetItemRepositoryImpl(){
		entityManager = JPAUtil.getEntityManager();
	}

	public SweetItem addSweetItem(SweetItem sweetItem) {
		entityManager.getTransaction().begin();
		entityManager.persist(sweetItem);
		entityManager.getTransaction().commit();
		return sweetItem;
		
	}

	public SweetItem updateSweetItem(SweetItem sweetItem) {
		entityManager.getTransaction().begin();
		entityManager.merge(sweetItem);
		entityManager.getTransaction().commit();
		return sweetItem;
	}
		

	public SweetItem cancelSweetItem(int sweetItem) {
		entityManager.getTransaction().begin();
		SweetItem result = entityManager.find(SweetItem.class, sweetItem);
		entityManager.remove(result);
		entityManager.getTransaction().commit();
		return result;
	}

	public List<SweetItem> showAllSweetItems() {
		TypedQuery<SweetItem> querySet = entityManager.createQuery("select c from SweetItem c",SweetItem.class);		
		List<SweetItem> sweet = querySet.getResultList();
		return sweet;
	}

}
