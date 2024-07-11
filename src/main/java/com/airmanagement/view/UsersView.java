package com.airmanagement.view;

import com.airmanagement.entities.Locations;
import com.airmanagement.entities.enums.UserType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsersView {

    private long id;

    @NotNull
    private String name;

    @NotNull
    @NotBlank
    private String email;

    @NotBlank
    @NotNull
    @Size(min = 6)
    private String password;

    @NotNull
    @NotBlank
    private String phone;

    @NotNull
    @NotBlank
    private String CPF;

    @NotNull
    private UserType userType;

    @NotNull
    private LocationsView locations;
}
