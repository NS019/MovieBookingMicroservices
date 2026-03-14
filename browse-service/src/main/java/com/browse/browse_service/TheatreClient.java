package com.browse.browse_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.browse.browse_service.dto.TheatreResponse;

@FeignClient(name = "theatre-service", url = "http://localhost:8082")
public interface TheatreClient {

    @GetMapping("/theatres/{id}")
    TheatreResponse getTheatre(@PathVariable Long id);

}
