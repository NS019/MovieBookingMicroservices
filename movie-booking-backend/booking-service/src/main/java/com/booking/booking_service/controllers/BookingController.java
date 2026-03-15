package com.booking.booking_service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.booking_service.entity.Booking;
import com.booking.booking_service.entity.Ticket;
import com.booking.booking_service.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
    
    @PostMapping("/tickets")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return bookingService.createTicket(ticket);
    }

    @GetMapping("/tickets")
    public List<Ticket> getAllTickets() {
        return bookingService.getAllTickets();
    }
}
