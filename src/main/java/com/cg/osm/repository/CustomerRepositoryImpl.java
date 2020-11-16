package com.cg.osm.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.cg.osm.entites.Customer;

public class CustomerRepositoryImpl implements CustomerRepository{
	
private EntityManager entityManager;
	
	public CustomerRepositoryImpl(){
		entityManager = JPAUtil.getEntityManager();
	}

	public Customer addCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

	public Customer updateCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

	public Customer cancelCustomer(int customerId) {
		entityManager.getTransaction().begin();
		Customer result = entityManager.find(Customer.class, customerId);
		entityManager.remove(result);
		entityManager.getTransaction().commit();
		return result;
	}

	public List<Customer> showAllCustomers() {
		TypedQuery<Customer> querySet = entityManager.createQuery("select c from Customer c",Customer.class);		
		List<Customer> customers = querySet.getResultList();
		return customers;
	}

	public List<Customer> showAllCustomers(int customerId) {
		TypedQuery<Customer> querySet = entityManager.createQuery("select c from Customer c where c.customerId==customerId",Customer.class);
		querySet.setParameter("customerId", customerId);
		List<Customer> customers = querySet.getResultList();
		return customers;
	}

}
