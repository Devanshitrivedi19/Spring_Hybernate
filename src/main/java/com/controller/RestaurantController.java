package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.RestaurantEntity;
import com.repository.RestaurantRepository;

@Controller
public class RestaurantController {

		@Autowired
		RestaurantRepository restaurantrepository;
		@GetMapping("/newrestaurant")
		public String NewRestaurant()
		{
			return "NewRestaurant";
		}
		
		@PostMapping("/saveRestaurant")
		public String SaveRestaurant(RestaurantEntity restaurantentity)
		{
			restaurantrepository.save(restaurantentity);
			return "Success";
		}
}
