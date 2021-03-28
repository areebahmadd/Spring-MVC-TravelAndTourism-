package com.virtusa.dto;


import com.virtusa.model.Customer;
import com.virtusa.model.TourPackage;

public class CustomerDto {

private int custId;
	
	private String name;
	
	private String email;
	
	private String mobilenumber;
	
	private String username;
	
	private String password;
	
	private TourPackage tourPackage;
	
	
	
	public Customer getCustomer()
	{
		Customer customerDto = new Customer();
		customerDto.setCustId(custId);
		customerDto.setName(name);
		customerDto.setEmail(email);
		customerDto.setMobilenumber(mobilenumber);
		customerDto.setUsername(username);
		customerDto.setPassword(password);
		customerDto.setTourPackage(tourPackage);
		return customerDto;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TourPackage getTourPackage() {
		return tourPackage;
	}

	public void setTourPackage(TourPackage tourPackage) {
		this.tourPackage = tourPackage;
	}

	@Override
	public String toString() {
		return "CustomerDto [custId=" + custId + ", name=" + name + ", email=" + email + ", mobilenumber="
				+ mobilenumber + ", username=" + username + ", password=" + password + ", tourPackage=" + tourPackage
				+ "]";
	}
	
	
	
}
