package com.showbooking.show_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.showbooking.show_service.entities.MovieShow;
import com.showbooking.show_service.services.ShowService;

@RestController
@RequestMapping("/shows")
public class ShowController {

	@Autowired
	private ShowService showService;

	@PostMapping
	public MovieShow createShow(@RequestBody MovieShow show) {
		return showService.createShow(show);
	}

	@GetMapping
	public List<MovieShow> getAllShows() {
		return showService.getAllShows();
	}

}
