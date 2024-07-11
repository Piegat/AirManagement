package com.airmanagement.view;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CompanyView {

    @NotNull
    private Long id;

    @Size(min = 2, max = 50)
    @NotBlank
    private String name;

    @Size(min = 2, max = 50)
    @NotBlank
    private String region;

}
