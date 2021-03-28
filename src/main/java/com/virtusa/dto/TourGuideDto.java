package com.virtusa.dto;

import com.virtusa.model.TourGuide;

public class TourGuideDto {
	private int tgid;
	private String name;
	private long mobileno;
	private String emailid;
	private String place;
	private long aadharno;
	
	
	
	public TourGuide getTourGuide()
	{
		TourGuide tgDto = new TourGuide();
		tgDto.setTgid (tgid);
		tgDto.setName(name);
		tgDto.setMobileno(mobileno);
		tgDto.setEmailid(emailid);
		tgDto.setPlace(place);
		tgDto.setAadharno(aadharno);
		return tgDto;
	}
	
	
	@Override
	public String toString() {
		return "TourGuideDto [tgid=" + tgid + ", name=" + name + ", mobileno=" + mobileno + ", emailid=" + emailid
				+ ", place=" + place + ", aadharno=" + aadharno + "]";
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
	
	

}
