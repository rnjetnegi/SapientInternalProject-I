package com;

public class Payment {
	private double amount; 
	private Order newOrder; // newOrder reference to Order type of object

	// Class Constructor 
	public Payment(double amount, Order order) {
		// exit if wrong input types(-ve amount, null order)
		if (amount < 0 || order == null) {
			System.out.println("Wrong input!!!!\n");
			System.exit(1);
		}
		setAmount(amount);
		setNewOrder(order);
	}

	//getter method for amount
	public double getAmount() {
		return amount;
	}
	
	//setter method for amount
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	//getter method for newOrder object
	public Order getNewOrder() {
		return newOrder;
	}
	//setter Object for newObject
	public void setNewOrder(Order newOrder) {
		this.newOrder = newOrder;
	}

}
