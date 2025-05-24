package com.siscon.demo.application.ports.input;

import com.siscon.demo.domain.model.Employee;

import java.util.List;

public interface EmployeeServicePort {
    Employee findById(Integer idEmployee);

    List<Employee> findAll();

    Employee save(Employee employee);

    Employee update(Integer idEmployee, Employee employee);
}
