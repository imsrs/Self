package org.cap.model;

public class Address {
	
	private String stName;
	private String city;
	
	public Address() {
		
	}
	
	public Address(String stName, String city) {
		super();
		this.stName = stName;
		this.city = city;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [stName=" + stName + ", city=" + city + "]";
	}
	
	

}
