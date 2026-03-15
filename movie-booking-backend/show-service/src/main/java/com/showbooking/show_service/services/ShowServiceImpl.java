package com.showbooking.show_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showbooking.show_service.entities.MovieShow;
import com.showbooking.show_service.repostiory.MovieShowRepository;

@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	private MovieShowRepository repository;

	@Override
	public MovieShow createShow(MovieShow show) {
		return repository.save(show);
	}

	@Override
	public List<MovieShow> getAllShows() {
		return repository.findAll();
	}

}
