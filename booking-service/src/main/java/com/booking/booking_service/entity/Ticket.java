package com.booking.booking_service.entity;

import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    private Long bookingId;

    private Long showSeatId;

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getShowSeatId() {
        return showSeatId;
    }

    public void setShowSeatId(Long showSeatId) {
        this.showSeatId = showSeatId;
    }
}