package com.airmanagement.view;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LocationsView {

    private Long id;

    @NotBlank
    private String streetNumber;

    @NotBlank
    @Size(min = 2, max = 50)
    private String road;

    @NotBlank
    @Size(min = 2, max = 50)
    private String city;

    @NotBlank
    @Size(min = 1, max = 50)
    private String state;

    @NotBlank
    @Size(min = 2, max = 50)
    private String country;

}
