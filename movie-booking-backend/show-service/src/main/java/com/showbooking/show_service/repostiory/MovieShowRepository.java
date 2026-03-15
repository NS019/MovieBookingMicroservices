package com.showbooking.show_service.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.showbooking.show_service.entities.MovieShow;

public interface MovieShowRepository extends JpaRepository<MovieShow, Long> {

}
