package com.virtusa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.virtusa.dao.TourGuideDaoInterface;
import com.virtusa.model.TourGuide;



@Service
public class TourGuideService implements TourGuideServiceInterface {
	
	@Autowired
	private TourGuideDaoInterface dao;


	
	//Saves tour Guide and also maps the tourguide to its respective package w.r.t. the place  
	public void saveTourGuide(TourGuide tourGuide) {
		 dao.createNewTourGuide(tourGuide);
		 }
		
	//Deletes tour guide using its id
	public void deleteTourGuide(int tgId) {
		dao.deleteTourGuide(tgId);
	}
	
	//gets the tour guide using its id 
	public TourGuide getTourGuide(int tgId) {
		return  dao.getTourGuide(tgId);
	}
	
	//Returns a list of Tour Guides  
	public List<TourGuide> getAllTourGuide() {
		return dao.getAllTourGuide();
	}

}


