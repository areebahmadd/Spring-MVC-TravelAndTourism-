package com.virtusa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtusa.dto.AdminSignUpDto;
import com.virtusa.model.AdminSignUp;
import com.virtusa.service.AdminServiceInterface;

//Admin Controller Class
@Controller
public class AdminController {

	@Autowired
	private AdminServiceInterface service;

	Logger logger = Logger.getLogger(AdminController.class);
	
	String login = "LoginAdmin";
	//Return to Login Page
	@RequestMapping("/adminlogin")
	public String login() {
		return login;
	}

	//Return to SignUp Page
	@RequestMapping("/signup")
	public String signUp(Model m) {
		m.addAttribute("mode", new AdminSignUp());
		return "AdminSignUp";
	}

	//Return to Home Page
	@RequestMapping("/home")
	public String homePage() {
		return "HomePage";
	}

	//Return to Admin Home Page
	@RequestMapping("/adminhome")
	public String homePageAdmin(HttpServletRequest request) {
		AdminSignUp admin =(AdminSignUp)request.getSession().getAttribute("admin");
		if(admin == null)
			  return "error";
		return "AdminHome";
	}

	//Return to Home Page on startup
	@RequestMapping("/")
	public String homePageH() {
		logger.info("Home Page ");
		return "HomePage";
	}
	
	//Return to Home Page on startup
	@RequestMapping("/logout")
	public String logout() {
		return login;
	}

	//SignUp validation 
	@RequestMapping(path = "/validate")
	@PostMapping
	public String signUp(@Valid @ModelAttribute("mode") AdminSignUpDto signUpDto,Model m, Errors errors) {
		if (errors.hasErrors()) {
			return "AdminSignUp";
		} else
			m.addAttribute("msg", "Successfully created new Account");
		AdminSignUp signUp = signUpDto.getAdminSignUp();
		service.signUp(signUp);
		return login;
	}

	//Login Validation
	@RequestMapping("/login")
	public String login(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, Model model,HttpServletRequest request) {
		if (service.checkLogin(username, password,request)) {
			return "AdminHome";
		}
		model.addAttribute("error", "Invalid Credentials! Try again");
		return login;
	}

}