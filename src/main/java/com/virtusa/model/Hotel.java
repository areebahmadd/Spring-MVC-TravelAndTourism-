package com.virtusa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.virtusa.dto.HotelDto;


//Hotel Model Class
@SuppressWarnings("serial")
@Entity
@Table(name = "HotelDetails")
public class Hotel implements  Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length = 15)
	private String name;

	@Column(length = 15)
	private String place;

	private double pricePerDay;

	
	public HotelDto getHotelDto()
	{
		HotelDto hotelDto = new HotelDto();
		hotelDto.setId(id);
		hotelDto.setName(name);
		hotelDto.setPlace(place);
		hotelDto.setPricePerDay(pricePerDay);
		return hotelDto;
		
	}
	
	public Hotel() {
		super();
	}


	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", place=" + place + ", pricePerDay=" + pricePerDay + "]";
	}

	public Hotel(int id, String name, String place, double pricePerDay) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.pricePerDay = pricePerDay;
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
	
}