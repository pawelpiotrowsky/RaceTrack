package com.example.RaceTrack.repository;


import com.example.RaceTrack.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserLocationRepository extends JpaRepository<Location, Long> {
    void deleteLocation(Long id);
}
