package com.theatrebooking.theatre_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theatrebooking.theatre_service.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}