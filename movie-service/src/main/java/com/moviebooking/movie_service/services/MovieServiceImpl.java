package com.moviebooking.movie_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebooking.movie_service.entities.Movie;
import com.moviebooking.movie_service.repository.MovieRepository;
import com.moviebooking.movie_service.services.exception.MovieNotFoundException;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepo;

	@Override
	public Movie createMovie(Movie movie) {
		return movieRepo.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepo.findAll();
	}

	@Override
	public Movie findMovieById(Long id) {
		return movieRepo.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not Found"));
	}

}
