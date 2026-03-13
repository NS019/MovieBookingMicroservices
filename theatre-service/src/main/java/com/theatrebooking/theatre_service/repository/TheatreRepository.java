package com.theatrebooking.theatre_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theatrebooking.theatre_service.entity.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
