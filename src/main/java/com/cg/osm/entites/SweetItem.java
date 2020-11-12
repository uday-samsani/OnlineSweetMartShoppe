package com.cg.osm.entites;

public class SweetItem 
{
    private int orderItemId;
    private Product product;
    private SweetOrder SweetOrder;
    
    
    public SweetItem() {
    	super();
    }
	public SweetItem(int orderItemId, Product product, com.cg.osm.entites.SweetOrder sweetOrder) 
	{
		super();
		this.orderItemId = orderItemId;
		this.product = product;
		SweetOrder = sweetOrder;
	}
	
	//Getters and Setters
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public SweetOrder getSweetOrder() {
		return SweetOrder;
	}
	public void setSweetOrder(SweetOrder sweetOrder) {
		SweetOrder = sweetOrder;
	}

	
    
}
