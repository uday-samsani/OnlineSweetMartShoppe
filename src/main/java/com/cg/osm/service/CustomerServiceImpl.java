package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Customer;
import com.cg.osm.repository.CustomerRepository;
import com.cg.osm.repository.CustomerRepositoryImpl;


public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository dao;
	
	CustomerServiceImpl() {
		dao = new CustomerRepositoryImpl();
	}

	public Customer addCustomer(Customer customer) {
		Customer result = dao.addCustomer(customer);
		return result;
	}

	public Customer updateCustomer(Customer customer) {
		Customer result = dao.updateCustomer(customer);
		return result;
	}

	public Customer cancelCustomer(int customerId) {
		Customer result = dao.cancelCustomer(customerId);
		return result;
	}

	public List<Customer> showAllCustomers() {
		List<Customer> result = dao.showAllCustomers();
		return result;
	}

	public List<Customer> showAllCustomers(int customerId) {
		List<Customer> result = dao.showAllCustomers(customerId);
		return result;
	}
}
