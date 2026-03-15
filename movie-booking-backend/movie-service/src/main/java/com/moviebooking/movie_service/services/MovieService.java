package com.moviebooking.movie_service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.movie_service.entities.Movie;

@Service
public interface MovieService {

	Movie createMovie(Movie movie);

	List<Movie> getAllMovies();

	Movie findMovieById(Long id);
}
