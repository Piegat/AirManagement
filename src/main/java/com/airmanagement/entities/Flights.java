package com.airmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "departureAirport_id")
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrivalAirport_id")
    private Airport arrivalAirport ;

    private LocalDateTime departureDate;

    private LocalDateTime arrivalDate;

    private LocalTime durationTime;

    private String airPlane;

    private int numberPassengers;

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", durationTime=" + durationTime +
                ", airPlane='" + airPlane + '\'' +
                ", numberPassengers=" + numberPassengers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flights = (Flights) o;

        return Objects.equals(id, flights.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
