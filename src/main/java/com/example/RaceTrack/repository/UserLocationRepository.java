package com.example.RaceTrack.repository;


import com.example.RaceTrack.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserLocationRepository extends JpaRepository<Location, Long> {

}
