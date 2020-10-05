package com.policyservice.ms.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;

public class CustomerGetForObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonAlias("cusId")
	private String customerId;
	@JsonAlias("cusName")
	private String customerName;
	@JsonAlias("address")
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