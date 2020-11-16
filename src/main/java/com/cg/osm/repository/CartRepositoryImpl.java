package com.cg.osm.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.osm.entites.Cart;

public class CartRepositoryImpl implements CartRepository {

	private EntityManager entityManager;

	public CartRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	public Cart addCart(Cart cart) {
		entityManager.getTransaction().begin();
		entityManager.persist(cart);
		entityManager.getTransaction().commit();
		return cart;
	}

	public Cart updateCart(Cart cart) {
		entityManager.getTransaction().begin();
		entityManager.merge(cart);
		entityManager.getTransaction().commit();
		return cart;
	}

	public Cart cancelCart(int cartId) {
		entityManager.getTransaction().begin();
		Cart result = entityManager.find(Cart.class, cartId);
		entityManager.remove(result);
		entityManager.getTransaction().commit();
		return result;
	}

	public List<Cart> showAllCarts() {
		TypedQuery<Cart> querySet = entityManager.createQuery("select c from Cart c", Cart.class);
		List<Cart> carts = querySet.getResultList();
		return carts;
	}

	public List<Cart> showAllCarts(int cartId) {
		TypedQuery<Cart> querySet = entityManager.createQuery("select c from Cart c where c.cartId==cartId",
				Cart.class);
		querySet.setParameter("cartId", cartId);
		List<Cart> carts = querySet.getResultList();
		return carts;
	}

}
