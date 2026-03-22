package com.theatrebooking.theatre_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.theatrebooking.theatre_service.entity.City;
import com.theatrebooking.theatre_service.repository.CityRepository;

// “Without @Service, Spring won’t create a bean, so dependency injection will fail.”
@Service
public class CityServiceImpl implements CityService {

	// @Autowired - This is field injection. Avoid it. Use Constructor Injection
	private CityRepository cityRepo;

	public CityServiceImpl(CityRepository cityRepo) {
		super();
		this.cityRepo = cityRepo;
	}

	public List<City> getAllCities() {
		// TODO Auto-generated method stub
		return cityRepo.findAll();
	}

}
