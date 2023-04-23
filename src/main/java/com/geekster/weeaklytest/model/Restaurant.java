package com.geekster.weeaklytest.model;

public class Restaurant {
	
	private String restaurantName;
	private String restaurantAddress;
	private String phNumber;
	private String speciality;
	private String numberOfStaffs;
	private String openAt;
	private String closeAt;
	private String id;
	public Restaurant(String restaurantName, String restaurantAddress, String phNumber, String speciality,
			String numberOfStaffs, String openAt, String closeAt,String id) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.phNumber = phNumber;
		this.speciality = speciality;
		this.numberOfStaffs = numberOfStaffs;
		this.openAt = openAt;
		this.closeAt = closeAt;
		this.id=id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getNumberOfStaffs() {
		return numberOfStaffs;
	}
	public void setNumberOfStaffs(String numberOfStaffs) {
		this.numberOfStaffs = numberOfStaffs;
	}
	public String getOpenAt() {
		return openAt;
	}
	public void setOpenAt(String openAt) {
		this.openAt = openAt;
	}
	public String getCloseAt() {
		return closeAt;
	}
	public void setCloseAt(String closeAt) {
		this.closeAt = closeAt;
	}
	
	
	

}
