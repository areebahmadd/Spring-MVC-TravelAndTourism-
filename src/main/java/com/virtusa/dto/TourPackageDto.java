package com.virtusa.dto;

import com.virtusa.model.Customer;
import com.virtusa.model.TourGuide;
import com.virtusa.model.TourPackage;

public class TourPackageDto {

	private int packageId;
	private String city;
	private String place;
	private String tourname;
	private double tourprice;
	private TourGuide tourGuide;
	private Customer customer;
	
	
	
	public TourPackage getTourPackage()
	{
		TourPackage packageDto = new TourPackage();
		packageDto.setPackageId(packageId);
		packageDto.setCity(city);
		packageDto.setPlace(place);
		packageDto.setTourname(tourname);
		packageDto.setTourprice(tourprice);
		packageDto.setTourGuide(tourGuide);
		packageDto.setCustomer(customer);
		return packageDto;
		
	}
	
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTourname() {
		return tourname;
	}
	public void setTourname(String tourname) {
		this.tourname = tourname;
	}
	public double getTourprice() {
		return tourprice;
	}
	public void setTourprice(double tourprice) {
		this.tourprice = tourprice;
	}
	public TourGuide getTourGuide() {
		return tourGuide;
	}
	public void setTourGuide(TourGuide tourGuide) {
		this.tourGuide = tourGuide;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "TourPackageDto [packageId=" + packageId + ", city=" + city + ", place=" + place + ", tourname="
				+ tourname + ", tourprice=" + tourprice + ", tourGuide=" + tourGuide + ", customer=" + customer + "]";
	}
	
	
}
