package com.virtusa.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.virtusa.dto.CustomerDto;
import com.virtusa.model.Customer;
import com.virtusa.model.Hotel;
import com.virtusa.model.TourPackage;
import com.virtusa.service.CustomerServiceInterface;
import com.virtusa.service.HotelServiceInterface;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerServiceInterface custService;
	@Autowired
	private HotelServiceInterface hotelService;

	Logger logger = Logger.getLogger(CustomerController.class);
	
	static final String ERROR ="error";
	static final  String HOTEL ="hotel";
	static final  String LOGIN ="login";
	static final  String PACKAGETOUR = "packageT";
	static final  String SESSIONCUSTOMER = "customer";
	
	//Maps to the Tourist login page
	@RequestMapping("/loginCustomer")
	public String homeBasic()
	{
		logger.info("Going to Login Customer");
		return LOGIN;
	}
	
	@RequestMapping("/homepageCustomer")
	public String homeBa()
	{
		logger.info("Going to Customer Home");
		return "HomePageTourist";
	}
	
	//Maps to the Tourist up functionality 
	@RequestMapping("/addCustomer")
	public String addCustomer(Model m)
	{
		logger.info("Adding new customer");
		return "add_customer_form";
	}
	
	//Performs the delete tourist functionality
	@RequestMapping("/deleteCustomer/{custId}")
	public RedirectView deleteCustomer(@PathVariable int custId, HttpServletRequest request)
	{
		logger.info("Deleting Customer with id "+custId);
		custService.deleteCusotmer(custId);
		RedirectView redirect = new RedirectView();
		redirect.setUrl(request.getContextPath()+"/");
		return redirect;
	}
	
	//Updates the Tourist using its tourist id
	  @RequestMapping("/updateCustomer") 
	  public String updateCustomer(Model m,HttpServletRequest request) 
	  { 
		  logger.info("Going to Update Customer Page");
		  Customer customer =(Customer)request.getSession().getAttribute(SESSIONCUSTOMER);
		  if(customer == null)
			  return ERROR;
		  m.addAttribute(SESSIONCUSTOMER,customer);
		  return "update-customer";
	  }
	 
	//Creates and saves the tourist in the database 
	@RequestMapping("/CustomerSignUp")
	public String createCustomer(@ModelAttribute() CustomerDto customerDto, Model m ) {
		Customer customer = customerDto.getCustomer();
		logger.info("Saving Customer");
		custService.saveCusotmer(customer);
		m.addAttribute("msg", "Successfully created new Tourist");
		
		return LOGIN;
		
	}
	
	//Checks if the given credentials are of a valid Tourist and returns values accordingly 
	@RequestMapping("/loginAction")
	public String loginCustomer(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password , HttpServletRequest request, Model m)
	{
		boolean result = custService.loginCustomer(username,password,request);
		logger.info("Validating Customer Login");
		if (result) 
				return "HomePageTourist";	
		m.addAttribute("msg" , "invalid credentials");
		return LOGIN;
		
	}
	
	////Maps to the view which shows all the available tourists 
	@RequestMapping("/showCustomer")
	public String show(Model m,HttpServletRequest request)
	{
		if(request.getSession().getAttribute(SESSIONCUSTOMER) == null)
			return ERROR;
		logger.info("Showing Customers");
		List<Customer> listCustomer = custService.getAllCusotmer();
		m.addAttribute("customers",listCustomer);
		return "viewCustomers";
	}
	
	
	@RequestMapping("/enrollCustomer/{packageId}")
	public String enroll(@PathVariable("packageId") int packageId, HttpServletRequest request, Model m)
	{
		if(request.getSession().getAttribute(SESSIONCUSTOMER) == null)
			return ERROR;
		logger.info("Enroll Customer");
		Customer customer =(Customer)request.getSession().getAttribute(SESSIONCUSTOMER);
		logger.info("package id = "+packageId+"  customer is ==="+customer);
		TourPackage packageT = custService.enrollCustomer(customer,packageId);
		m.addAttribute(PACKAGETOUR, packageT); 
		request.getSession().setAttribute(PACKAGETOUR,packageT);
		
		List<Hotel> listH = hotelService.viewHotel();
		for(int i =0; i<listH.size();i++)
			if(listH.get(i).getPlace().equals(packageT.getPlace()))
			{
				m.addAttribute(HOTEL, listH.get(i));
				request.getSession().setAttribute(HOTEL,listH.get(i));
				return "SelectRooms";
			}
		return "checkOut";
	}
	
	@RequestMapping("/calculateRoom")
	public String calculate(@RequestParam(name = "noOfRooms") int noOfRooms, HttpServletRequest request, Model m)
	{
		logger.info("Calculate Room");
		Hotel hotel =(Hotel)request.getSession().getAttribute(HOTEL);
		TourPackage packageT =(TourPackage)request.getSession().getAttribute(PACKAGETOUR);
		double total = (hotel.getPricePerDay() * noOfRooms) + packageT.getTourprice();
		 m.addAttribute("total", total); 
		 m.addAttribute(PACKAGETOUR, packageT); 
		 return "checkOutWithHotel";
		 
	}
	
	//Logs off tourist  
	@RequestMapping("/logoutCustomer")
	public String logout(Model m,HttpServletRequest request)
	{
		logger.info("Customer Logout");
		request.getSession().setAttribute(SESSIONCUSTOMER , null);
		return LOGIN;
	}
}