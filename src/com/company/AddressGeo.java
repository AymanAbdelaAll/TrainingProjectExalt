package com.company;

import org.jetbrains.annotations.NotNull;



public class AddressGeo extends Address {
    private Geo geo;

    public AddressGeo() { }

    public AddressGeo(@NotNull Geo geo, @NotNull String street, @NotNull String suite, @NotNull String city, @NotNull String zipcode) {
        super(street, suite, city, zipcode);
        this.geo = geo;
        super.isGeo=true;
    }
    public Geo getGeo() {
        return geo;
    }

    public void setGeo(@NotNull Geo geo) {
        this.geo = geo;
    }

    @Override
    public boolean equals(Object o) {
        AddressGeo addressGeo=(AddressGeo) o;
        return super.equals(addressGeo) && geo.equals(addressGeo.geo) ;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + super.getStreet() + '\'' +
                ", suite='" + super.getSuite() + '\'' +
                ", city='" + super.getCity() + '\'' +
                ", zipcode='" + super.getZipcode() + '\'' +
                ", " + geo.toString() +
                '}';
    }
}
