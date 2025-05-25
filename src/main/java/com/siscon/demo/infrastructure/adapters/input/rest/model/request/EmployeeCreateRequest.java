package com.siscon.demo.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCreateRequest {
    @NotBlank(message = "Field firstname cannot be empty or null.")
    private String firstname;

    @NotNull(message = "Field middlename cannot be null.")
    private String middlename;

    @NotBlank(message = "Field lastname cannot be empty or null.")
    private String lastname;

    @NotNull(message = "Field secondsurname cannot be null.")
    private String secondsurname;

    @NotNull(message = "Field age cannot be null.")
    private Integer age;

    @NotBlank(message = "Field gender cannot be empty or null.")
    private String gender;

    @NotNull(message = "Field birthdate cannot be null.")
    private LocalDate birthdate;

    @NotBlank(message = "Field position cannot be empty or null.")
    private String position;
}
