package com;

public class NewCustomer {

	// New customer Name
	private String newCustomerName;

	// New Customer Address
	private String newCustomerAddress;

	// New Customer Order
	private Order newCustomerOrder;

	//constructor
	public NewCustomer(String name, String address, Order order) {
		setNewCustomerName(name);
		setNewCustomerAddress(address);
		setNewCustomerOrder(order);
	}
	//getter method for new Customer
	public String getNewCustomerName() {
		return newCustomerName;
	}
	//setter method for new customer
	public void setNewCustomerName(String newCustomerName) {
		this.newCustomerName = newCustomerName;
	}
	//gettre method for customer address
	public String getNewCustomerAddress() {
		return newCustomerAddress;
	}
	//setter method for new customers address
	public void setNewCustomerAddress(String newCustomerAddress) {
		this.newCustomerAddress = newCustomerAddress;
	}
	
	//getter method for new customer Order
	public Order getNewCustomerOrder() {
		return newCustomerOrder;
	}
	//Setter method for new customer arder
	public void setNewCustomerOrder(Order newCustomerOrder) {
		this.newCustomerOrder = newCustomerOrder;
	}
}
