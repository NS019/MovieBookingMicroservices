package com.browse.browse_service.service;

import java.util.List;

import com.browse.browse_service.dto.BrowseResponse;

public interface BrowseService {

    List<BrowseResponse> browseShows(Long movieId, Long cityId, String date);

}
