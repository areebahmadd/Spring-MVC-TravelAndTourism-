package com.virtusa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.virtusa.dto.CustomerDto;

@SuppressWarnings("serial")
@Entity
public class Customer implements  Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	
	@Column(length = 15)
	private String name;
	
	@Column(length = 20)
	private String email;
	
	@Column(length = 15)
	private String mobilenumber;
	
	@Column(length = 15)
	private String username;
	
	@Column(length = 15)
	private String password;
	
	@OneToOne
	private TourPackage tourPackage;
	

	public CustomerDto getCustomerDto()
	{
		CustomerDto customerDto = new CustomerDto();
		customerDto.setCustId(custId);
		customerDto.setName(name);
		customerDto.setEmail(email);
		customerDto.setMobilenumber(mobilenumber);
		customerDto.setUsername(username);
		customerDto.setPassword(password);
		customerDto.setTourPackage(tourPackage);
		return customerDto;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", email=" + email + ", mobilenumber=" + mobilenumber
				+ ", username=" + username + ", password=" + password +  "]";
	}

	public Customer(int custId, String name, String email, String mobilenumber, String username, String password,
			TourPackage tourPackage) {
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.username = username;
		this.password = password;
		this.tourPackage = tourPackage;
	}

	public Customer() {
		super();
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
}
	
	
	
	
	
	
