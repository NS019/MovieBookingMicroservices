package com.theatrebooking.theatre_service.service;

import java.util.List;

import com.theatrebooking.theatre_service.entity.Theatre;

public interface TheatreService {

    Theatre createTheatre(Theatre theatre);

    List<Theatre> getAllTheatres();
    
    Theatre getTheatreById(Long theatreId);
}
