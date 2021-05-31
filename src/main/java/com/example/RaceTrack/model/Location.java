package com.example.RaceTrack.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
public class Location {
    public Location(Long id, double longitude, double latitude, OffsetDateTime measuredAt) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.measuredAt = measuredAt;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public OffsetDateTime getMeasuredAt() {
        return measuredAt;
    }

    public void setMeasuredAt(OffsetDateTime measuredAt) {
        this.measuredAt = measuredAt;
    }
    @Id
    private Long id;
    private double longitude;
    private double latitude;
    private OffsetDateTime measuredAt;
}
