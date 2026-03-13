package com.theatrebooking.theatre_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theatrebooking.theatre_service.entity.Screen;

public interface ScreenRepository extends JpaRepository<Screen, Long> {
}
