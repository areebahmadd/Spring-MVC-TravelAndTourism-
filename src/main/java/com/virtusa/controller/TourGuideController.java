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

import com.virtusa.dto.TourGuideDto;
import com.virtusa.model.TourGuide;
import com.virtusa.service.TourGuideServiceInterface;

@Controller
public class TourGuideController {

	@Autowired
	private TourGuideServiceInterface guideService;

	Logger logger = Logger.getLogger(TourGuideController.class);

	static final  String DISPLAYGUIDES = "DisplayGuides";

	static final  String GUIDESATTRIBUTE = "guides";

	static final  String TOURGUIDEATTRIBUTE = "tourGuide";

	// Maps to the view which displays the tour guide details
	@RequestMapping("/guideDetails/{tgid}")
	public String displayPackage(@PathVariable("tgid") int tgid, Model m, HttpServletRequest request) {
		TourGuide tourGuide = guideService.getTourGuide(tgid);
		m.addAttribute(TOURGUIDEATTRIBUTE, tourGuide);
		return "viewGuideAdmin";

	}

	// Maps to the view which displays the tour guide details
	@RequestMapping("/guideDetail/{tgid}")
	public String displayPackages(@PathVariable("tgid") int tgid, Model m, HttpServletRequest request) {
		TourGuide tourGuide = guideService.getTourGuide(tgid);
		m.addAttribute(TOURGUIDEATTRIBUTE, tourGuide);
		return "viewGuide";
	}

	// Maps to the sign up page for tour guide
	@RequestMapping("/addGuide")
	public String addCustomer(Model m, HttpServletRequest request) {
		if (request.getSession().getAttribute("admin") == null)
			return "error";
		m.addAttribute("title", "Add New Guide");
		return "AddGuide";
	}

	// Adds and saves the tour guide details in the database
	@RequestMapping("/saveGuide")
	public String createGuide(@ModelAttribute TourGuideDto tourGuideDto, HttpServletRequest request, Model m) {
		if (request.getSession().getAttribute("admin") == null)
			return "error";
		TourGuide tourGuide = tourGuideDto.getTourGuide();
		guideService.saveTourGuide(tourGuide);
		logger.info("Sccuessfully created guide " + tourGuide);
		m.addAttribute(TOURGUIDEATTRIBUTE, tourGuide);
		return "viewGuideAdmin";
	}

	// Displaying added Guide Details
	@RequestMapping("/displayGuides")
	public String displayGuides(Model m) {
		List<TourGuide> guides = guideService.getAllTourGuide();
		m.addAttribute(GUIDESATTRIBUTE, guides);

		return DISPLAYGUIDES;
	}

	// Displaying added Guide Details
	@RequestMapping("/viewGuides")
	public String displayGuidesTourist(Model m) {
		List<TourGuide> guides = guideService.getAllTourGuide();
		m.addAttribute("tourGuides", guides);
		return "viewGuide";
	}

	// Updates the Hotel Details using its id
	@RequestMapping("/updateGuide/{id}")
	public String updateHotel(@PathVariable int id, Model m) {
		TourGuide guide = guideService.getTourGuide(id);
		m.addAttribute("guide", guide);
		return "update-guide";
	}

	@RequestMapping("/updatedGuide")
	public String updatedHotel(@ModelAttribute TourGuideDto tourGuideDto, Model m) {
		TourGuide guide = tourGuideDto.getTourGuide();
		guideService.saveTourGuide(guide);
		List<TourGuide> guides = guideService.getAllTourGuide();
		m.addAttribute(GUIDESATTRIBUTE, guides);
		return DISPLAYGUIDES;
	}

	@RequestMapping("/deleteGuide/{id}")
	public String deleteGuide(@PathVariable int id, Model m) {
		guideService.deleteTourGuide(id);
		List<TourGuide> guides = guideService.getAllTourGuide();
		m.addAttribute(GUIDESATTRIBUTE, guides);
		return DISPLAYGUIDES;
	}
}
