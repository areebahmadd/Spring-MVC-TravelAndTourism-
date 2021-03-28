package com.virtusa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.virtusa.model.AdminSignUp;

@Repository
public interface AdminDaoInterface {

	public void signUp(AdminSignUp signUp);
	
	public List<AdminSignUp> getAllAdmin();
}
