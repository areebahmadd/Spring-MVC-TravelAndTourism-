package com.virtusa.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.virtusa.dao.CustomerDaoInterface;
import com.virtusa.model.Customer;
import com.virtusa.model.TourPackage;

@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	private CustomerDaoInterface dao;
	@Autowired
	private TourPackageServiceInterface packageService;

	//Saves or updates customer
	public void saveCusotmer(Customer customer) {
		dao.createNewCustomer(customer);
	}
	
	//Deletes Customer
	public void deleteCusotmer(int custId) {
		dao.deleteCustomer(custId);
	}
	
	//Gets customer with primary key
	public Customer getCusotmer(int custId) {
		return  dao.getCustomer(custId);
	}
	
	//Gets all Customers
	public List<Customer> getAllCusotmer() {
		return dao.getAllCustomer();
	}

	//Validates Credentials and logs customer in
	public boolean loginCustomer(String username, String password, HttpServletRequest request) {
		
		boolean result = false;
		List<Customer> customers = dao.getAllCustomer();
		for (Customer customer : customers) 
		{
			if((customer.getUsername().equals(username)) &&(customer.getPassword().equals(password))) {	
				request.getSession().setAttribute("customer",customer); 
			     result = true;
			}
		}
				
		return result;
	}
	
	//Maps Customer with its package
	public TourPackage enrollCustomer(Customer customer,int packageId)
	{
		TourPackage packageT =  packageService.getTourPackage(packageId);
		packageT.setCustomer(customer);
		packageService.saveTourPackage(packageT);
		customer.setTourPackage(packageT);
		dao.createNewCustomer(customer);
		return packageT;
	}
	
	 
}
