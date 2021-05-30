package model;

import java.time.OffsetDateTime;

public class Location {
    public Location(double longitude, double latitude, OffsetDateTime measuredAt) {
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

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public OffsetDateTime getMeasuredAt() {
        return measuredAt;
    }

    public void setMeasuredAt(OffsetDateTime measuredAt) {
        this.measuredAt = measuredAt;
    }

    private double longitude;
    private double latitude;
    private OffsetDateTime measuredAt;
}
