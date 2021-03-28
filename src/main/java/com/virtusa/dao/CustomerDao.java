package com.virtusa.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.model.Customer;

@Transactional 
@Repository
public class CustomerDao implements CustomerDaoInterface {

	@Autowired
	private HibernateTemplate template;
	
	//Saves or updates Tourist
	@Transactional
	public void createNewCustomer(Customer customer)
	{
		this.template.saveOrUpdate(customer);
	}
	
	//Gets all Tourist
	@Transactional 
	public List<Customer> getAllCustomer()
	{
		return this.template.loadAll(Customer.class);
	}
	
	//Deletes using primary key
	@Transactional
	public void deleteCustomer(int custId)
	{
		Customer customer = this.template.load(Customer.class, custId);
		this.template.delete(customer);
	}
	
	//Gets using primary key
	@Transactional 
	public Customer getCustomer(int custId)
	{
		return this.template.get(Customer.class, custId);
	}
}
