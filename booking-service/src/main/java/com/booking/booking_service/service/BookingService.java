package com.booking.booking_service.service;

import java.util.List;

import com.booking.booking_service.entity.Booking;
import com.booking.booking_service.entity.Ticket;

public interface BookingService {

    Booking createBooking(Booking booking);

    List<Booking> getAllBookings();
    
    Ticket createTicket(Ticket ticket);

    List<Ticket> getAllTickets();
}
	