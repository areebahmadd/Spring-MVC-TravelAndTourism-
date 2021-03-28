package com.virtusa.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.virtusa.model.AdminSignUp;

@Service
public interface AdminServiceInterface {

	public boolean checkLogin(String username, String password,HttpServletRequest request);
	
	public void signUp(AdminSignUp signUp);
}
