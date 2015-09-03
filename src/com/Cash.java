package com;

public class Cash extends Payment {
	private double cashTendered; // declaration of variable cashTender of type double
	//geter method for cashTended
	public double getCashTendered() {
		return cashTendered;
	}
	//seter method for cashTender
	public void setCashTendered(double cashTendered) {
		this.cashTendered = cashTendered;
	}
}
