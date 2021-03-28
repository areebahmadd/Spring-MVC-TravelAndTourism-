package com.virtusa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.virtusa.model.Hotel;

@Repository
public interface HotelDaoInterface {

	public void addHotels(Hotel hotel);
	
	public List<Hotel> getAllHotels();
	
	public Hotel getHotel(int id);
	
	public void deleteHotel(int id);
}
