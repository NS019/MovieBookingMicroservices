package com.showbooking.show_service.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.showbooking.show_service.entities.ShowSeat;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

}
