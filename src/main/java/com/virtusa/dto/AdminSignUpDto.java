package com.virtusa.dto;

import com.virtusa.model.AdminSignUp;
public class AdminSignUpDto {

	private int uniqueNo;

	private String name;

	private String mobileNo;

	private String email;

	private String username;

	private String password;
	
	
	
	public AdminSignUp getAdminSignUp()
	{
		AdminSignUp adminDto = new AdminSignUp();
		adminDto.setUniqueNo(uniqueNo);
		adminDto.setName(name);
		adminDto.setEmail(email);
		adminDto.setMobileNo(mobileNo);
		adminDto.setUsername(username);
		adminDto.setPassword(password);
		return adminDto;
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

	@Override
	public String toString() {
		return "AdminSignUpDto [uniqueNo=" + uniqueNo + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
}
