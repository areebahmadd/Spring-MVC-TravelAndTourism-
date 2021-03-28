package com.virtusa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.virtusa.model.TourPackage;

@Service
public interface TourPackageServiceInterface {
	
	public void saveTourPackage(TourPackage customer);
	
	public void deleteTourPackage(int packageId);
	
	public TourPackage getTourPackage(int packageId);
	
	public List<TourPackage> getAllTourPackage();

}
