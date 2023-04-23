# Welcome to readme-md-generator &#x1F44B; 
![example workflow](https://img.shields.io/badge/Eclipse-Version%3A%202022--09%20(4.25.0)-orange)
![example workflow](https://img.shields.io/badge/SpringBoot-2.2.1-yellowgreen)
![example workflow](https://img.shields.io/badge/Java-8-yellowgreen)
![example workflow](https://img.shields.io/badge/Postman-v10.13-orange)
![example workflow](https://img.shields.io/badge/Documentation-Yes-green)
![example workflow](https://img.shields.io/badge/Manitained%3F-Yes-green)
 >CLI that generate beautiful **ReadME**.md files

  :house:  <b><span style="color: blue;">Homepage</span></b>
  


 # Prerequisties

 - Eclipse >=4.55.0
 - Postman >=10.13


# Install
```
Maven Install
SpringTool Install
```
 # Framework And Language

 - Framework :  SpringBoot
 - Language :  Java

# DataFlow

<b><span style="color: white;">Controller</span></b>

1. *@GetMapping("/restaurants")*
```
public ArrayList<Restaurant> getAll() {
		return restaurantServices.getAll();
	}
```
2. *@GetMapping("/restaurants/{id}")*
```
	public Restaurant getById(@PathVariable("id") String id) {
		
		return restaurantServices.getById(id);
		
	}
```
3. *@PostMapping("/restaurant")*
```
	public String addRestaurant(@RequestBody Restaurant restaurant) {
		
		
		return restaurantServices.addRestaurant( restaurant);
	}
```
4. *@PutMapping("{id}")*
```
	public String addRestaurant(@RequestBody Restaurant restaurant) {
		
		
		return restaurantServices.addRestaurant( restaurant);
	}
```
5. *@DeleteMapping("{id}")*
```
	public String deleteById(@PathVariable("id") String id) {
		
		return restaurantServices.deleteById(id);
	}
```

<b><span style="color: white;">Services</span></b>

1.*restaurantServices.getAll()*

```
    public ArrayList<Restaurant> getAll() {
		
		return restaurantDao.getList();
	}
		
		
```
2.*restaurantServices.getById(id)*
```
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
```
3.*restaurantServices.addRestaurant( restaurant)*
```
  ArrayList<Restaurant>current=restaurantDao.getList();
		
		current.add(restaurant);
		
		restaurantDao.setList(current);
		return "Restaurant added sucessfully";
	
	
```
4.*restaurantServices.addRestaurant( restaurant)*
```
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
	
	
```
5.*restaurantServices.deleteById(id)*
```
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
	
	
```

<b><span style="color: white;">Repository</span></b>
  
  1. *restaurantDao.getList()*
  ```
  	public ArrayList<Restaurant> getList() {
		return list;
	}
  ```
  2. *restaurantDao.setList(current)*
  ```
  public void setList(ArrayList<Restaurant> list) {
		this.list = list;
	}
  ```
  3. *restaurantDao.updataById(r,restaurant)*
   
   ```
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
   ```
   4. *restaurantDao.deleteById(r)*

```
	
	public void deleteById(Restaurant r) {
		list.remove(r);
		
	}
		
	
```


 






# Datastructure Used

<details>
<summary><b><span style="color: white;">Clickme</span></b> &#x1F4F2; </summary>

   *ARRAYLIST*



</details>




# Summary

 Build a Restaurant model and perform operations like 

 * get Restaurant by id using GetMapping

* get all Reataurant using  GetMapping

* add some Restaurant to Restaurant lists using PostMapping

* update Restaurant information like Specialty. 

* delete Restaurant from the list.





# :handshake:  Contributing
  Contributions,issues and features request are welcome! 
  

  #


  This *README* was generated with &#x2764;&#xFE0F; by <b><span style="color: blue;">readme-md-generator</span></b> 










   
  
  

