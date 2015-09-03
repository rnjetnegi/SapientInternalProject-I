package com;

public class OrderDetail {
	
	private Integer quantity;
	public Integer getQuantity() {return quantity;}
	public void setQuantity(Integer quantity) {this.quantity = quantity;}
	
	private Order order;
	public Order getOrder() {return order;}
	public void setOrder(Order order) {this.order = new Order();}
	
	boolean taxStatus;
	public boolean isTaxStatus() {return taxStatus;}
	public void setTaxStatus(boolean taxStatus) {this.taxStatus = taxStatus;}

	private Item item;
	public Item getItem() {return item;}
	public void setItem(Item item) {this.item = new Item();}

	public double calcSubTotal(){
		return 0;
	}
	public double calcWeight(){
		return 0;
	}
	
	public OrderDetail(){
		
	}
	
}
