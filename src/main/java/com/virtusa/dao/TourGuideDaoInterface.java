package com.virtusa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.virtusa.model.TourGuide;

@Repository
public interface TourGuideDaoInterface {
	
	public void createNewTourGuide(TourGuide tourGuide);
	
	public List<TourGuide> getAllTourGuide();
	
	public void deleteTourGuide(int tid);
	
	public TourGuide getTourGuide(int tid);

}
