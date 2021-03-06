package com.policyservice.ms.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.policyservice.ms.model.CustomerGetForObject;

@Service
public class CustomerServiceGetForObject {
	public CustomerGetForObject getCustomerDetails (String customerId) {
		RestTemplate restTemplate = new RestTemplate();
		CustomerGetForObject customer = restTemplate.getForObject("https://localhost:8081/mongoCustomer/" + customerId, CustomerGetForObject.class);
		return customer;
	}
}