package com.example.RaceTrack.service;

import com.example.RaceTrack.model.Location;
import com.example.RaceTrack.repository.UserLocationRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    private final UserLocationRepository userLocationRepository;

    public LocationService(UserLocationRepository userLocationRepository, Location location) {
        this.userLocationRepository = userLocationRepository;
    }

    public Location saveLocation(Location location) {
        return null;
    }

    public void deleteLocation(Long id) {
        userLocationRepository.deleteById(id);
    }
}

