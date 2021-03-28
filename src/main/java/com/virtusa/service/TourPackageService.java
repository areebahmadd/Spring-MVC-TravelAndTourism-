package com.virtusa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.virtusa.dao.TourPackageDaoInterface;
import com.virtusa.model.TourPackage;

@Service
public class TourPackageService implements TourPackageServiceInterface {
	
	@Autowired
	private TourPackageDaoInterface dao;

	//Saves tour package
	public void saveTourPackage(TourPackage customer) {
		dao.createNewTourPackage(customer);
	}
	
	//Deletes tour package
	public void deleteTourPackage(int packageId) {
		dao.deleteTourPackage(packageId);
	}
	
	//Gets tour package
	@Transactional
	public TourPackage getTourPackage(int packageId) {
		return  dao.getTourPackage(packageId);
	}
	
	//Returns a list of all tour package
	@Transactional
	public List<TourPackage> getAllTourPackage() {
		return dao.getAllTourPackage();
	}

}
