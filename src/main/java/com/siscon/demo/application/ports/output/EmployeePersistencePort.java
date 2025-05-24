package com.siscon.demo.application.ports.output;

import com.siscon.demo.domain.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeePersistencePort {
    Optional<Employee> findById(Integer idEmployee);

    List<Employee> findAll();

    Employee save(Employee employee);

}
