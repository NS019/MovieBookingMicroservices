package com.moviebooking.movie_service.services.exception;

public class MovieNotFoundException extends RuntimeException {

	public MovieNotFoundException(String message) {
		super(message);
	}
}
