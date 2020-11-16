package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer cancelCustomer(int customer);
	public List<Customer> showAllCustomers();
	public List<Customer> showAllCustomers(int customerId);

}