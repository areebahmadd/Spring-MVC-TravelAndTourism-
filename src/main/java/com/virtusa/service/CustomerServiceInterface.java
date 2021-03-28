package com.virtusa.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.virtusa.model.Customer;
import com.virtusa.model.TourPackage;

@Service
public interface CustomerServiceInterface {
	
	public void saveCusotmer(Customer customer);
	
	public void deleteCusotmer(int custId);
	
	public Customer getCusotmer(int custId);
	
	public List<Customer> getAllCusotmer();
	
	public boolean loginCustomer(String username, String password, HttpServletRequest request);
	
	public TourPackage enrollCustomer(Customer customer,int packageId);
}
