package com.example.RaceTrack.service;

import com.example.RaceTrack.repository.UserLocationRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    private final UserLocationRepository userLocationRepository;

    public LocationService(UserLocationRepository userLocationRepository) {
        this.userLocationRepository = userLocationRepository;
    }

}
