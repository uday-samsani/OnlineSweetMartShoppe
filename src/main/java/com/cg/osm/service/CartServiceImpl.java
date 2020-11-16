package com.cg.osm.service;

import java.util.List;

import com.cg.osm.entites.Cart;
import com.cg.osm.repository.CartRepository;
import com.cg.osm.repository.CartRepositoryImpl;


public class CartServiceImpl implements CartService {
	
	private CartRepository dao;
	
	CartServiceImpl() {
		dao = new CartRepositoryImpl();
	}

	public Cart addCart(Cart cart) {
		Cart result = dao.addCart(cart);
		return result;
	}

	public Cart updateCart(Cart cart) {
		Cart result = dao.updateCart(cart);
		return result;
	}

	public Cart cancelCart(int cartId) {
		Cart result = dao.cancelCart(cartId);
		return result;
	}

	public List<Cart> showAllCarts() {
		List<Cart> result = dao.showAllCarts();
		return result;	
	}

	public List<Cart> showAllCarts(int cartId) {
		List<Cart> result = dao.showAllCarts(cartId);
		return result;
	}

}
