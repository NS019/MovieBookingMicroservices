package com.browse.browse_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.browse.browse_service.TheatreClient;
import com.browse.browse_service.dto.BrowseResponse;
import com.browse.browse_service.dto.ShowResponse;
import com.browse.browse_service.dto.TheatreResponse;

@Service
public class BrowseServiceImpl implements BrowseService {
	
    @Autowired
    private WebClient webClient;

    @Autowired
    private TheatreClient theatreClient;

    @Override
    public List<BrowseResponse> browseShows(Long movieId, Long cityId, String date) {

        List<ShowResponse> shows =
                webClient.get()
                .uri("lb://show-service/shows")
                .retrieve()
                .bodyToFlux(ShowResponse.class)
                .collectList()
                .block();  // webclient

        return shows.stream().map(show -> {

            TheatreResponse theatre =
                    theatreClient.getTheatre(show.getTheatreId()); //feign client
            BrowseResponse response = new BrowseResponse();

            response.setShowId(show.getShowId());
            response.setScreenId(show.getScreenId());
            response.setShowTime(show.getShowTime());
            response.setPrice(show.getPrice());
            response.setTheatreId(theatre.getTheatreId());
            response.setTheatreName(theatre.getTheatreName());

            return response;

        }).collect(Collectors.toList());
    }
}