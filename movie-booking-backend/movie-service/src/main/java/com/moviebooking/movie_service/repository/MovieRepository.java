package com.moviebooking.movie_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.movie_service.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
