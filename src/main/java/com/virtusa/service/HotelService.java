package com.virtusa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.dao.HotelDaoInterface;
import com.virtusa.model.Hotel;

//Hotel Service Class
@Service
public class HotelService implements HotelServiceInterface{

	@Autowired
	private HotelDaoInterface dao;

	//Adding Hotel details
	public void addHotel(Hotel hotel) {
		dao.addHotels(hotel);
	}

	//Fetching hotel details
	public List<Hotel> viewHotel() {
		return dao.getAllHotels();
	}

	@Override
	public Hotel getHotel(int id) {
		return dao.getHotel(id);
	}

	@Override
	public void deleteHotel(int id) {
		dao.deleteHotel(id);
	}
}
