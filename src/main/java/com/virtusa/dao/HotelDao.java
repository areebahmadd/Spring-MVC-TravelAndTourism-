package com.virtusa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.model.Hotel;

//Hotel Repository Class
@Repository
public class HotelDao implements HotelDaoInterface{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	//Saving Hotel details to Database
	@Transactional
	public void addHotels(Hotel hotel) {
		this.hibernateTemplate.saveOrUpdate(hotel);
	}

	//Fetching added Hotel details from Database
	public List<Hotel> getAllHotels() {
		return this.hibernateTemplate.loadAll(Hotel.class);
	}

	@Override
	public Hotel getHotel(int id) {
		return this.hibernateTemplate.get(Hotel.class, id);
	}

	@Override
	@Transactional
	public void deleteHotel(int id) {
		Hotel hotel = this.hibernateTemplate.load(Hotel.class, id);
		this.hibernateTemplate.delete(hotel);
	}
}
