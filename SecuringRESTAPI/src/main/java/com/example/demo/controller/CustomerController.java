package com.example.demo.controller;

import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable String id){
		
		return new Customer(id,"Customer"+id);
	}
	
	


}