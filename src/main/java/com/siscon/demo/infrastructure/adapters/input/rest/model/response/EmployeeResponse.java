package com.siscon.demo.infrastructure.adapters.input.rest.model.response;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private Integer idEmployee;

    private String firstName;
    private String middleName;
    private String lastName;
    private String secondSurName;
    private Integer age;
    private String gender;
    private LocalDate birthDate;
    private String position;
}
