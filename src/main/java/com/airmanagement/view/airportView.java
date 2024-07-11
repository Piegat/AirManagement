package com.airmanagement.view;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class airportView {

    private Long id;

    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

}
