package com.booking.booking_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.booking_service.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
