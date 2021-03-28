package com.virtusa.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.model.TourGuide;


@Transactional 
@Repository
public class TourGuideDao implements TourGuideDaoInterface {

	@Autowired
	private HibernateTemplate template;
	
	//Saves or updates new TourGuide
	@Transactional
	public void createNewTourGuide(TourGuide tourGuide)
	{
		this.template.saveOrUpdate(tourGuide);
	}
	
	//Gets all TourGuide
	@Transactional 
	public List<TourGuide> getAllTourGuide()
	{
		return this.template.loadAll(TourGuide.class);
	}
	
	//Deletes using primary key
	@Transactional
	public void deleteTourGuide(int tid)
	{
		TourGuide tourGuide = this.template.load(TourGuide.class, tid);
		this.template.delete(tourGuide);
	}
	
	//Gets using primary key
	@Transactional 
	public TourGuide getTourGuide(int tid)
	{
		return this.template.get(TourGuide.class, tid);
	}
	
}
