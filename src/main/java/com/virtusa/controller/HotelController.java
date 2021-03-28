package com.virtusa.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.dto.HotelDto;
import com.virtusa.model.Hotel;
import com.virtusa.service.HotelService;

//Hotel Controller Class
@Controller
public class HotelController {

	@Autowired
	private HotelService service;

	Logger logger = Logger.getLogger(HotelController.class);
	
	static final  String HOTELATTRIBUTE = "hotels";
	static final  String DISPLAYHOTELS = "DisplayHotels";
	
	//Return to Adding Guide Page
	@RequestMapping("/addhotel")
	public String addHotel() {
		logger.info("Going to Add Hotel Page");
		return "AddHotel";
	}

	//Return to success page after adding hotel details
	@RequestMapping(path = "/addedhotel")
	@PostMapping
	public String addHotel(@ModelAttribute HotelDto hotelDto,Model m) {
		Hotel hotel = hotelDto.getHotel();
		logger.info("Adding New Hotel");
		service.addHotel(hotel);
		m.addAttribute("msg", "Successfully added, want to add more Hotel.");
		return "AddHotel";
	}

	//Displaying added Guide Details
	@RequestMapping("/displayHotels")
	public String displayHotels(Model m) {
		logger.info("Displaying Hotels");
		List<Hotel> hotels = service.viewHotel();
		m.addAttribute(HOTELATTRIBUTE, hotels);
		return DISPLAYHOTELS;
	}
	
	//Displaying added Guide Details
		@RequestMapping("/displayPlaces")
		public String displayHotel(Model m) {
			logger.info("Displaying Hotels");
			List<Hotel> hotels = service.viewHotel();
			m.addAttribute(HOTELATTRIBUTE, hotels);
			return "DisplayPlaces";
		}

	//Updates the Hotel Details using its id
	 @RequestMapping("/updateHotel/{id}") 
	 public String updateHotel(@PathVariable int id, Model m) 
	 { 
		 logger.info("Updating Hotels");
		 Hotel hotel = service.getHotel(id);
		 m.addAttribute("hotel",hotel);
		 return "update-hotel";
	 }
	 
	 @RequestMapping("/updatedHotel") 
	 public String updatedHotel(@ModelAttribute HotelDto hotelDto, Model m) 
	 { 
		 Hotel hotel = hotelDto.getHotel();
		 logger.info("Updating Hotels");
		 service.addHotel(hotel);
		 List<Hotel> hotels = service.viewHotel();
			m.addAttribute(HOTELATTRIBUTE, hotels);

			return DISPLAYHOTELS;
	 }
	 
	 @RequestMapping("/deleteHotel/{id}")
	 public String deleteHotel(@PathVariable int id,Model m)
	 {
		 logger.info("Deleting Hotels with id "+id);
		 service.deleteHotel(id);
		 List<Hotel> hotels = service.viewHotel();
		 m.addAttribute(HOTELATTRIBUTE, hotels);
		 return DISPLAYHOTELS;
	 }
}