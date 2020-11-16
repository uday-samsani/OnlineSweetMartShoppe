package com.cg.osm.entites;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private long userId;
	private String name;
	private Set<SweetOrder> sweetOrders;
	private List<SweetItem> sweetItems;
	public Cart cart;

	//default constructor
	public Customer() {
		super();
	}

	//parameterized constructor or constructor with fields
	public Customer(long userId, String name, Set<SweetOrder> sweetOrders, List<SweetItem> sweetItems, Cart cart) {
		super();
		this.userId = userId;
		this.name = name;
		this.sweetOrders = sweetOrders;
		this.sweetItems = sweetItems;
		this.cart = cart;
	}

	//getters and setters
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<SweetOrder> getSweetOrders() {
		return sweetOrders;
	}

	public void setSweetOrders(Set<SweetOrder> sweetOrders) {
		this.sweetOrders = sweetOrders;
	}

	public List<SweetItem> getSweetItems() {
		return sweetItems;
	}

	public void setSweetItems(List<SweetItem> sweetItems) {
		this.sweetItems = sweetItems;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	//toString
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", sweetOrders=" + sweetOrders + ", sweetItems="
				+ sweetItems + ", cart=" + cart + "]";
	}

}
