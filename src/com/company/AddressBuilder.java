package com.company;

import org.jetbrains.annotations.NotNull;

public class AddressBuilder {
    public static Address createAddress(@NotNull String street, @NotNull String suite, @NotNull String city, @NotNull String zipcode){
        return new Address(street,suite,city,zipcode);
    }
    public static Address createAddressGeo(@NotNull Geo geo, @NotNull String street, @NotNull String suite, @NotNull String city, @NotNull String zipcode){
        return new AddressGeo(geo,street,suite,city,zipcode);
    }
}
