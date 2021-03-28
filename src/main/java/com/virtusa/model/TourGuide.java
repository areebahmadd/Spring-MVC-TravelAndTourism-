package com.virtusa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.virtusa.dto.TourGuideDto;

@SuppressWarnings("serial")
@Entity
public class TourGuide implements  Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tgid;
	private String name;
	private long mobileno;
	private String emailid;
	private String place;
	private long aadharno;

	
	public TourGuideDto getTourGuideDto()
	{
		TourGuideDto tgDto = new TourGuideDto();
		tgDto.setTgid (tgid);
		tgDto.setName(name);
		tgDto.setMobileno(mobileno);
		tgDto.setEmailid(emailid);
		tgDto.setPlace(place);
		tgDto.setAadharno(aadharno);
		return tgDto;
	}
	
	public int getTgid() {
		return tgid;
	}
	public void setTgid(int tgid) {
		this.tgid = tgid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	
	public TourGuide() {
		super();
	}
	public TourGuide(int tgid, String name, long mobileno, String emailid, String place, long aadharno) {
		super();
		this.tgid = tgid;
		this.name = name;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.place = place;
		this.aadharno = aadharno;

	}
	@Override
	public String toString() {
		return "TourGuide [tgid=" + tgid + ", name=" + name + ", mobileno=" + mobileno + ", emailid=" + emailid
				+ ", place=" + place + ", aadharno=" + aadharno + "]";
	}
	
	
	
	
	
}
