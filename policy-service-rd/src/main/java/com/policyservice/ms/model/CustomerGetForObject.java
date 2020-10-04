package com.policyservice.ms.model;

import java.io.Serializable;

public class CustomerGetForObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerId;
	private String customerName;
	private String address;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
