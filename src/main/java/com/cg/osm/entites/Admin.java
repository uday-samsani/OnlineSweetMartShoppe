package com.cg.osm.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	private String id;
	private String password;
	private Customer customer;
	private User user;
	private SweetItem item;
	private Category category;
	public Cart cart;
	public Product product;
	
	// Constructor default  
	public Admin() {
		super();
	}
	
	// Constructor with fields
	public Admin(String id, String password, Customer customer, User user, SweetItem item, Category category, Cart cart,
			Product product) {
		super();
		this.id = id;
		this.password = password;
		this.customer = customer;
		this.user = user;
		this.item = item;
		this.category = category;
		this.cart = cart;
		this.product = product;
	}
	
	// Getters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public User getUser() {
		return user;
	}
	
	// Setters

	public void setUser(User user) {
		this.user = user;
	}

	public SweetItem getItem() {
		return item;
	}

	public void setItem(SweetItem item) {
		this.item = item;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
