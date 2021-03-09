package com.company;

import org.jetbrains.annotations.NotNull;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address() { }

    /**
     *
     * @param geo
     * @param members ,an array that has four parameter of filed (street, suite, city, zipcode)
     */
    public Address(@NotNull Geo geo, @NotNull String...members){
        this.setStreet(members[0]);
        this.setSuite(members[1]);
        this.setCity(members[2]);
        this.setZipcode(members[3]);
        this.setGeo(geo);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(@NotNull String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(@NotNull String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(@NotNull String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(@NotNull String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(@NotNull Geo geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo.toString() +
                '}';
    }
}
