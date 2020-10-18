package com.cs322.ors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cs322.ors.model.Dish;
import com.cs322.ors.service.DishService;

@RestController

public class DishController {
	
	@Autowired
	private DishService dishService;
	
	@RequestMapping("/Menu")
	public List<Dish> getAllDishes(){
		return dishService.getAllDishes();
	}
		
	@RequestMapping("/Menu/{dishId}")
	public Dish getDish(@PathVariable int dishId) {
		return dishService.getDish(dishId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/Menu")
	public void addDish(@RequestBody Dish dish) {
		dishService.addDish(dish);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/Menu/{dishId}")
	public void updateDish(@RequestBody Dish dish,@PathVariable int dishId) {
		dishService.updateDish(dish);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/Menu/{dishId}")
	public void deleteDish(@RequestBody Dish dish,@PathVariable int dishId) {
		dishService.deleteDish(dish);
	}
	
	


}