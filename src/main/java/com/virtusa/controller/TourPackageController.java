package com.virtusa.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.dto.TourPackageDto;
import com.virtusa.model.TourGuide;
import com.virtusa.model.TourPackage;
import com.virtusa.service.TourGuideServiceInterface;
import com.virtusa.service.TourPackageServiceInterface;

@Controller
public class TourPackageController {

	@Autowired
	private TourPackageServiceInterface packageService;
	@Autowired
	private TourGuideServiceInterface guideService;
	static final  String TOURPACKAGE ="tourPackages";
	
	//Returns the list of all Tour Package back to JSP
	@RequestMapping("/TourPackage")
	public String displayPackage( Model  m,HttpServletRequest request)
	{
		  List<TourPackage> listTour = packageService.getAllTourPackage();
		  m.addAttribute(TOURPACKAGE, listTour);
		  return "showPackage";
		
	}
	
	@RequestMapping("/TourPackageAdmin")
	public String displayPackageAdmin( Model  m,HttpServletRequest request)
	{
		  List<TourPackage> listTour = packageService.getAllTourPackage();
		  m.addAttribute(TOURPACKAGE, listTour);
		  return "showPackageAdmin";
	}
	
	//Redirects to adding new tour details jsp
	@RequestMapping("/newTour")
	public String addPackage(HttpServletRequest request)
	{
		return "AddTourPackage";
		
	}
	
	//Saves the tour details and maps the guide to it 
	@RequestMapping("/saveTour")
	public String savePackage(TourPackageDto tourpackageDto, Model m,HttpServletRequest request)
	{
		if(request.getSession().getAttribute("admin") == null)
			return "error";
		TourPackage tourpackage = tourpackageDto.getTourPackage();
		List<TourGuide> listGuide = guideService.getAllTourGuide();

		for(int i =0 ; i<listGuide.size();i++)
		{
			if(listGuide.get(i).getPlace().equals(tourpackage.getPlace()))
				tourpackage.setTourGuide(listGuide.get(i));
		}
		packageService.saveTourPackage(tourpackage);
		List<TourPackage> listTour = packageService.getAllTourPackage();
		m.addAttribute(TOURPACKAGE, listTour);
		return "showPackageAdmin";
		
	}
}
