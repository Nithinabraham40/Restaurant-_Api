package com.geekster.weeaklytest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.weeaklytest.model.Restaurant;
import com.geekster.weeaklytest.services.RestaurantServices;

@RestController()
@RequestMapping("/api/tourism")
public class RestaurantController {
	
	
	@Autowired
	RestaurantServices restaurantServices;
	
	
	@GetMapping("/restaurants")
	
	public ArrayList<Restaurant> getAll() {
		return restaurantServices.getAll();
	}
	
	@GetMapping("/restaurants/{id}")
	
	public Restaurant getById(@PathVariable("id") String id) {
		
		return restaurantServices.getById(id);
		
	}
	
	@PostMapping("/restaurant")
	public String addRestaurant(@RequestBody Restaurant restaurant) {
		
		
		return restaurantServices.addRestaurant( restaurant);
	}
	
	@PutMapping("{id}")
	public String updateById(@PathVariable("id")String id, @RequestBody Restaurant restaurant ) {
		
		return restaurantServices.updateById(id,restaurant);
	}
	
	@DeleteMapping("{id}")
	public String deleteById(@PathVariable("id") String id) {
		
		return restaurantServices.deleteById(id);
	}
	

	
}
