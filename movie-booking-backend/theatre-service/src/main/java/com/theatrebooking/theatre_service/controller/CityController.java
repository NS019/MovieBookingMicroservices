package com.theatrebooking.theatre_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theatrebooking.theatre_service.entity.City;
import com.theatrebooking.theatre_service.service.CityService;

@RestController
@RequestMapping("/cities")
public class CityController {
	
	private CityService cityService;
	
	public CityController(CityService cityService) {
		this.cityService=cityService;
	}
	
	@GetMapping
	public List<City> getAllCities(){
		return cityService.getAllCities();
	}

}
