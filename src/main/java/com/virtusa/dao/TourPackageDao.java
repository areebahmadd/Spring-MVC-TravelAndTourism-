package com.virtusa.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.model.TourPackage;


@Transactional 
@Repository
public class TourPackageDao implements TourPackageDaoInterface {

	

		@Autowired
		private HibernateTemplate template;
		
		//Saves or updates new TourPackage
		@Transactional
		public void createNewTourPackage(TourPackage tourPackage)
		{
			this.template.saveOrUpdate(tourPackage);
		}
		
		//Gets all TourPackage
		@Transactional
		public List<TourPackage> getAllTourPackage()
		{
			return this.template.loadAll(TourPackage.class);
		}
		
		//Deletes using primary key
		@Transactional
		public void deleteTourPackage(int packageId)
		{
			TourPackage tourPackage = this.template.load(TourPackage.class, packageId);
			this.template.delete(tourPackage);
		}
		
		//Gets using primary key
		@Transactional
		public TourPackage getTourPackage(int packageId)
		{
			return this.template.get(TourPackage.class, packageId);
		}
		

}


