package com.siscon.demo.domain.model;

import java.time.LocalDate;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
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
