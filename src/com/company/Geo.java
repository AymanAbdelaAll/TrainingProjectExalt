package com.company;

import org.jetbrains.annotations.NotNull;

public class Geo {

    // def is 0 which will be returned if geo doesnt exist , better use auto boxing with object Double
    private double lat;
    private double lng;

    public Geo() { }

    /**
     *
     * @param  , an array that has two element represent parameter(lat,lng)
     */
    public Geo(@NotNull double...members) {
        // TODO : bad use of var-args because caller has no clue which string would be assigned to what. better is to explicitly define parameters
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
