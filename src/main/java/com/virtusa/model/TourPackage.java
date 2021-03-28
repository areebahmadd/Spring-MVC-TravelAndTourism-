package com.virtusa.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.virtusa.dto.TourPackageDto;

@SuppressWarnings("serial")
@Entity
public class TourPackage implements  Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int packageId;
	private String city;
	private String place;
	private String tourname;
	private double tourprice;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tgid")
	private TourGuide tourGuide;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer customer;
	
	
	public TourPackage() {
		super();
	}


	public TourPackageDto getTourPackageDto()
	{
		TourPackageDto packageDto = new TourPackageDto();
		packageDto.setPackageId(packageId);
		packageDto.setCity(city);
		packageDto.setPlace(place);
		packageDto.setTourname(tourname);
		packageDto.setTourprice(tourprice);
		packageDto.setTourGuide(tourGuide);
		packageDto.setCustomer(customer);
		return packageDto;
		
	}
	
	public TourPackage(int packageId, String city, String place, String tourname, double tourprice, TourGuide tourGuide,
			Customer customer) {
		super();
		this.packageId = packageId;
		this.city = city;
		this.place = place;
		this.tourname = tourname;
		this.tourprice = tourprice;
		this.tourGuide = tourGuide;
		this.customer = customer;
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
		return "TourPackage [packageId=" + packageId + ", city=" + city + ", place=" + place + ", tourname=" + tourname
				+ ", tourprice=" + tourprice + ", tourGuide=" + tourGuide + ", customer=" + customer + "]";
	}


	
	
	
	
	
	
	
}
