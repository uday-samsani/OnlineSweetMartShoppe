package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Cart;

public interface CartService {

	public Cart addCart(Cart cart);

	public Cart updateCart(Cart cart);
	
	public Cart cancelCart(int cartId);

	public List<Cart> showAllCarts();
	
	public List<Cart> showAllCarts(int cartId);


}
