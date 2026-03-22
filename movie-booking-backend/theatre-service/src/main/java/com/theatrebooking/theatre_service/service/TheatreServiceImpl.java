package com.theatrebooking.theatre_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theatrebooking.theatre_service.entity.Theatre;
import com.theatrebooking.theatre_service.repository.TheatreRepository;

@Service
public class TheatreServiceImpl implements TheatreService {
	@Autowired
	private TheatreRepository theatreRepository;

	@Override
	public Theatre createTheatre(Theatre theatre) {
		return theatreRepository.save(theatre);
	}

	@Override
	public List<Theatre> getAllTheatres() {
		return theatreRepository.findAll();
	}

	@Override
	public Theatre getTheatreById(Long theatreId) {
		return theatreRepository.findById(theatreId).orElseThrow(() -> new RuntimeException("Theatre not found"));
	}

	@Override
	public Theatre updateTheatre(Long theatreId, Theatre theatre) {
		Theatre existing = theatreRepository.findById(theatreId)
				.orElseThrow(() -> new RuntimeException("Theatre not found with id: " + theatreId));
		Optional.ofNullable(theatre.getCity()).ifPresent(existing::setCity);
		Optional.ofNullable(theatre.getAddress()).ifPresent(existing::setAddress);
		Optional.ofNullable(theatre.getTheatreName()).ifPresent(existing::setTheatreName);

		return theatreRepository.save(existing);
	}
}
