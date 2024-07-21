package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public class Customerservice {
	
@Autowired
private com.example.demo.repo.CustomerRepo repo;

public Optional<Customer> getDetailsById(int id)
{
return	repo.findById(id);
 
	}
public Customer saveDetails(Customer c) {
	// TODO Auto-generated method stub
	return repo.save(c);
}

}