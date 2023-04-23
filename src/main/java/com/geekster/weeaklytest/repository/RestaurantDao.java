package com.geekster.weeaklytest.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.geekster.weeaklytest.model.Restaurant;

@Repository
public class RestaurantDao {
	
	private ArrayList<Restaurant>list=new ArrayList<>();

	public ArrayList<Restaurant> getList() {
		return list;
	}

	public void setList(ArrayList<Restaurant> list) {
		this.list = list;
	}

	public void updataById(Restaurant updatedRestaurant, Restaurant restaurant) {
		
		updatedRestaurant.setRestaurantName(restaurant.getRestaurantName());
		updatedRestaurant.setRestaurantAddress(restaurant.getRestaurantAddress());
		updatedRestaurant.setId(restaurant.getId());
		updatedRestaurant.setNumberOfStaffs(restaurant.getNumberOfStaffs());
		updatedRestaurant.setSpeciality(restaurant.getSpeciality());
		updatedRestaurant.setOpenAt(restaurant.getOpenAt());
		updatedRestaurant.setCloseAt(restaurant.getCloseAt());
		updatedRestaurant.setPhNumber(restaurant.getPhNumber());
		
	}

	public void deleteById(Restaurant r) {
		list.remove(r);
		
	}

	
	
	

}
