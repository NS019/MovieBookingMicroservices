package com.showbooking.show_service.services;

import java.util.List;

import com.showbooking.show_service.entities.MovieShow;

public interface ShowService {

	MovieShow createShow(MovieShow show);

	List<MovieShow> getAllShows();

}
