package com.cg.osm.repository;

import java.util.List;

import com.cg.osm.entites.Customer;

public interface CustomerRepository {

		public Customer addCustomer(Customer customer);

		public Customer updateCustomer(Customer customer);
		
		public Customer cancelCustomer(int customerId);

		public List<Customer> showAllCustomers();
		
		public List<Customer> showAllCustomers(int customerId);

}