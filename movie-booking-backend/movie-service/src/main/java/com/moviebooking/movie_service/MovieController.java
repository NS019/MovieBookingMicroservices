package com.moviebooking.movie_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviebooking.movie_service.entities.Movie;
import com.moviebooking.movie_service.services.MovieService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@PostMapping
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}

	@GetMapping
	public List<Movie> getMovies() {
		return movieService.getAllMovies();
	}

	@GetMapping("/findById/{id}")
	public Movie getMovieById(@PathVariable Long id) {
		return movieService.findMovieById(id);
	}
}
