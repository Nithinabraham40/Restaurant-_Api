package com.geekster.weeaklytest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.geekster.weeaklytest.model.Restaurant;
import com.geekster.weeaklytest.repository.RestaurantDao;

@Service
public class RestaurantServices {
	
	
	@Autowired
	RestaurantDao restaurantDao;

	public ArrayList<Restaurant> getAll() {
		
		return restaurantDao.getList();
	}

	public Restaurant getById(String id) {
	
		ArrayList<Restaurant>current=restaurantDao.getList();
		
		if(id!=null) {
		
		for(Restaurant r:current) {
			
			if(r.getId().equals(id)) {
				return r;
				
				
			}
			
		}return null;
		
		}else {
			return null;
		}
	}

	public String addRestaurant(Restaurant restaurant) {
		
		ArrayList<Restaurant>current=restaurantDao.getList();
		
		current.add(restaurant);
		
		restaurantDao.setList(current);
		return "Restaurant added sucessfully";
	}

	public String updateById(String id, Restaurant restaurant) {
		ArrayList<Restaurant>current=restaurantDao.getList();
		
		if(id!=null) {
			
			for(Restaurant r:current) {
				
				if(r.getId().equals(id)) {
					restaurantDao.updataById(r,restaurant);
					
					return "Sucessfully updated";
					
					
				}
				
			}return "id not found!!";
			
			}else {
				return "id is null";
			}
		}

	public String deleteById(String id) {
		ArrayList<Restaurant>current=restaurantDao.getList();
		

		if(id!=null) {
			
			for(Restaurant r:current) {
				
				if(r.getId().equals(id)) {
					
					
					
					restaurantDao.deleteById(r);
					return "Deleted Sucessfully";
					
					
				}
				
			}return "id not found!!";
			
			}else {
				return "id is null";
			}
		
		
		
	}
		
	}


