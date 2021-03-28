package com.virtusa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.virtusa.dto.AdminSignUpDto;




//AdminSignUp Model Class
@SuppressWarnings("serial")
@Entity
@Table(name = "AdminSignUp")
public class AdminSignUp implements  Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int uniqueNo;

	@NotEmpty(message = "Name cannot be empty!")
	@Column(length = 15)
	private String name;

	@NotEmpty(message = "MobileNo cannot be empty!")
	@Column(length = 15)
	private String mobileNo;

	@NotEmpty(message = "Email cannot be empty!")
	@Email
	@Column(length = 20)
	private String email;

	@NotEmpty(message = "Username cannot be empty!")
	@Column(length = 15)
	private String username;

	@NotEmpty(message = "Password cannot be empty!")
	@Column(length = 15)
	private String password;

	
	public AdminSignUpDto getAdminSignUpDto()
	{
		AdminSignUpDto adminDto = new AdminSignUpDto();
		adminDto.setUniqueNo(uniqueNo);
		adminDto.setName(name);
		adminDto.setEmail(email);
		adminDto.setMobileNo(mobileNo);
		adminDto.setUsername(username);
		adminDto.setPassword(password);
		return adminDto;
	}
	
	public AdminSignUp(int uniqueNo, @NotEmpty(message = "Name cannot be empty!") String name,
			@NotEmpty(message = "MobileNo cannot be empty!") String mobileNo,
			@NotEmpty(message = "Email cannot be empty!") @Email String email,
			@NotEmpty(message = "Username cannot be empty!") String username,
			@NotEmpty(message = "Password cannot be empty!") String password) {
		super();
		this.uniqueNo = uniqueNo;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public AdminSignUp() {
		super();
	}

	public int getUniqueNo() {
		return uniqueNo;
	}

	public void setUniqueNo(int uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "AdminSignUp [uniqueNo=" + uniqueNo + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", username=" + username + ", password=" + password + "]";
	}

	
}
