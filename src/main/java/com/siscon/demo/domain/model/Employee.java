package com.siscon.demo.domain.model;

import java.time.LocalDate;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
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
