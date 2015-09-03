package com;

public class Check extends Payment implements Authorization{
	
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	private Integer bankID;
	public Integer getBankID() {return bankID;}
	public void setBankID(Integer bankID) {this.bankID = bankID;}
	
	@Override
	public boolean authorized() {
		// TODO Auto-generated method stub
		return false;
	}
}
