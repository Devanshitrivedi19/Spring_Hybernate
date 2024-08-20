package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		@GetMapping("/listrestaurants")
		public String ListRestaurants(Model model)
		{
			List<RestaurantEntity> restaurants=restaurantrepository.findAll();
			
			model.addAttribute("restaurants", restaurants);
			return "ListRestaurant";
		}
		@GetMapping("/deleterestaurant")
		public String deleteRestaurant(@RequestParam("restaurantId") Integer restaurantId)
		{
			System.out.println("deleteRestaurant==>"+restaurantId);
			restaurantrepository.deleteById(restaurantId);
			return "redirect:/listrestaurants";
		}
}
