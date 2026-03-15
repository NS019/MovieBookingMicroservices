package com.browse.browse_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.browse.browse_service.dto.BrowseResponse;
import com.browse.browse_service.service.BrowseService;

@RestController
@RequestMapping("/browse")
public class BrowseController {

    @Autowired
    private BrowseService browseService;

    @GetMapping
    public List<BrowseResponse> browseShows(
            @RequestParam Long movieId,
            @RequestParam Long cityId,
            @RequestParam String date) {

        return browseService.browseShows(movieId, cityId, date);
    }
}
