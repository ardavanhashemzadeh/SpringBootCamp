package com.policyservice.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policyservice.ms.model.Customer;
import com.policyservice.ms.model.CustomerGetForObject;
import com.policyservice.ms.model.Policy;
import com.policyservice.ms.repository.IPolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	IPolicyRepository policyRepository;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CustomerServiceGetForObject customerServiceAlternate;

	/*
	public Policy createPolicy(Policy policy) {
		Customer customer;
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}
	*/
	
	public Policy createPolicy(Policy policy) {
		Customer customer;
		customer = customerServiceAlternate.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}
	
	public List<Policy> getPolicies() {
		return policyRepository.findAll();
	}

}
