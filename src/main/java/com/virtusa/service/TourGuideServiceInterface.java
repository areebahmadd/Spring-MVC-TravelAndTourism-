package com.virtusa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.virtusa.model.TourGuide;

@Service
public interface TourGuideServiceInterface {
	
	public void saveTourGuide(TourGuide tourGuide);
	
	public void deleteTourGuide(int tgId);
	
	public TourGuide getTourGuide(int tgId);
	
	public List<TourGuide> getAllTourGuide();
}
