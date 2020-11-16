package com.cg.osm.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	private int cartId;
	private int productCount;
	private double grantTotal, total;
	private List<Product> listProduct;
	public Cart(double grantTotal, List<Product> listProduct, int cartId, int productCount, double total) {
		super();
		this.grantTotal = grantTotal;
		this.cartId = cartId;
		this.productCount = productCount;
		this.total = total;
	}
	public double getGrantTotal() {
		return grantTotal;
	}
	public void setGrantTotal(double grantTotal) {
		this.grantTotal = grantTotal;
	}
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Cart [grantTotal=" + grantTotal + ", cartId=" + cartId + ", productCount=" + productCount + ", total="
				+ total + ", listProduct=" + listProduct + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (cartId != other.cartId)
			return false;
		return true;
	}
}
