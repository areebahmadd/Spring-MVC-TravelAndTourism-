package com.virtusa.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.dao.AdminDaoInterface;
import com.virtusa.model.AdminSignUp;

//Admin Service Class
@Service
public class AdminService implements AdminServiceInterface{

	@Autowired
	private AdminDaoInterface adminDao;

	//Validating Login
	@Override
	public boolean checkLogin(String username, String password,HttpServletRequest request) {
		boolean check = false;
		List<AdminSignUp> admins = adminDao.getAllAdmin();
		for (AdminSignUp signUp : admins) {
			if (username.equals(signUp.getUsername()) && password.equals(signUp.getPassword())) {
				request.getSession().setAttribute("admin",signUp); 
				check = true;
			}
		}
		return check;
	}

	//Adding SignUp details
	public void signUp(AdminSignUp signUp) {
		adminDao.signUp(signUp);
	}

}
