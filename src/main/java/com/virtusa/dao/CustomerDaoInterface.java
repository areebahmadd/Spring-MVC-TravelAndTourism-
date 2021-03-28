package com.virtusa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.virtusa.model.Customer;

@Repository
public interface CustomerDaoInterface {
	
	public void createNewCustomer(Customer customer);
	
	public List<Customer> getAllCustomer();
	
	public void deleteCustomer(int custId);
	
	public Customer getCustomer(int custId);
}
