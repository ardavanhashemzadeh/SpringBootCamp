package com.policyservice.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.policyservice.ms.model.Policy;
import com.policyservice.ms.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired(required=false)
	PolicyService policyService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	
	@RequestMapping(value="/policy",method = RequestMethod.POST)
	public Policy createPolicy(@RequestBody Policy policy) {
//		return policy;
		return policyService.createPolicy(policy);
	}
	
	@RequestMapping(value="/policies", method = RequestMethod.GET)
	public List<Policy> getPolicies(){
		return policyService.getPolicies();
	}
	
	@RequestMapping(value="/policyUsingGetForObject", method = RequestMethod.POST)
	public Policy createPolicyUsingGetForObject(@RequestBody Policy policy){
		return policyService.createPolicyUsingGetForObject(policy);
	}
}
