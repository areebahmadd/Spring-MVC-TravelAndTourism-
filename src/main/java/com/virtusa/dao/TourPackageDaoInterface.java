package com.virtusa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.virtusa.model.TourPackage;

@Repository
public interface TourPackageDaoInterface {

	public void createNewTourPackage(TourPackage tourPackage);
	
	public List<TourPackage> getAllTourPackage();
	
	public void deleteTourPackage(int packageId);
	
	public TourPackage getTourPackage(int packageId);
	
}
