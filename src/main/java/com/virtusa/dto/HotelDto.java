package com.virtusa.dto;

import com.virtusa.model.Hotel;

public class HotelDto {
	
	private int id;
	private String name;
	private String place;
	private double pricePerDay;
	
	
	public Hotel getHotel()
	{
		Hotel hotelDto = new Hotel();
		hotelDto.setId(id);
		hotelDto.setName(name);
		hotelDto.setPlace(place);
		hotelDto.setPricePerDay(pricePerDay);
		return hotelDto;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	@Override
	public String toString() {
		return "HotelDto [id=" + id + ", name=" + name + ", place=" + place + ", pricePerDay=" + pricePerDay + "]";
	}


	
}
