package com.siscon.demo.infrastructure.adapters.input.rest.model.response;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private Integer idemployee;

    private String firstname;
    private String middlename;
    private String lastname;
    private String secondsurname;
    private Integer age;
    private String gender;
    private LocalDate birthdate;
    private String position;
}
