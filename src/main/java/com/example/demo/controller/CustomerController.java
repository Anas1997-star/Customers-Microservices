package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.Customerservice;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	Customerservice customerService;
	
	@PostMapping("/")
public Customer saveDetails(@RequestBody Customer c) 
	{
	return customerService.saveDetails(c);
}
	
	@GetMapping("/{id}")
	public Optional<Customer> getDetails(@PathVariable("id")  int id) {
		return customerService.getDetailsById(id);
		
	}


}