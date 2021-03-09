package com.company;

import org.jetbrains.annotations.NotNull;

public class Geo {
    private double lat;
    private double lng;

    public Geo() { }

    /**
     *
     * @param  , an array
     */
    public Geo(@NotNull double...members) {
        this.setLat(members[0]);
        this.setLng(members[1]);
    }

    public double getLat() {
        return lat;
    }

    public void setLat(@NotNull double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(@NotNull double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
