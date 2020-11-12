package com.cg.osm.repository;

import java.util.List;

import com.cg.osm.entites.Customer;

public interface CustomerRepositroy {

	
	public  abstract void addCustomer(Customer customer);
	public  abstract void updateCustomer(Customer customer);
	public  abstract void cancelCustomer(Customer customer);
	public  abstract List<Customer> showAllCustomers();
	public  abstract List<Customer> showAllCustomers(int customerId);

}
