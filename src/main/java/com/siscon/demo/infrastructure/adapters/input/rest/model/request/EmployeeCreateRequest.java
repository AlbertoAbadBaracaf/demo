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
    @NotBlank(message = "Field firstName cannot be empty or null.")
    private String firstName;

    private String middleName;

    @NotNull(message = "Field lastName cannot be empty or null.")
    private String lastName;

    private String secondSurName;

    @NotNull(message = "Field age cannot be null.")
    private Integer age;

    @NotBlank(message = "Field gender cannot be empty or null.")
    private String gender;

    @NotBlank(message = "Field birthDate cannot be empty or null.")
    private LocalDate birthDate;

    @NotBlank(message = "Field position cannot be empty or null.")
    private String position;
}
