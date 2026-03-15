package com.theatrebooking.theatre_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theatrebooking.theatre_service.entity.City;

public interface CityRepository extends JpaRepository<City, Long> {
}
