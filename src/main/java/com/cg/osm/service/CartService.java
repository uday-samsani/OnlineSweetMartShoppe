package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Cart;

public interface CartService {

	public abstract void addCart(Cart cart);

	public abstract void updateCart(Cart cart);
	
	public abstract void cancelCart(int cartId);

	public abstract List<Cart> showAllCarts();
	
	public abstract List<Cart> showAllCarts(int cartId);

}
