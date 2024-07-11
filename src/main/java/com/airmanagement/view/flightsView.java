package com.airmanagement.view;

import com.airmanagement.entities.Airport;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class flightsView {

    private Long id;

    @NotNull
    private airportView from;

    @NotNull
    private airportView until;

    @NotNull
    private LocalDateTime departureDate;

    @NotNull
    private LocalDateTime arrivalDate;

    private LocalTime durationTime;



}
