package com.virtusa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.virtusa.model.Hotel;

@Service
public interface HotelServiceInterface {

	public void addHotel(Hotel hotel);
	
	public List<Hotel> viewHotel();
	
	public Hotel getHotel(int id);
	
	public void deleteHotel(int id);
}
