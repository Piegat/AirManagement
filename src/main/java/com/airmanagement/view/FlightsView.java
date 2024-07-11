package com.airmanagement.view;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FlightsView {

    private Long id;

    @NotNull
    private AirportView from;

    @NotNull
    private AirportView until;

    @NotNull
    private LocalDateTime departureDate;

    @NotNull
    private LocalDateTime arrivalDate;

    @NotNull
    private LocalTime durationTime;

    @NotNull
    private String airPlane;

    @NotNull
    private int numberPassengers;


}
