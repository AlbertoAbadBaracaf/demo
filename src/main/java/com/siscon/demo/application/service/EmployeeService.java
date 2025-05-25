package com.siscon.demo.application.service;

import com.siscon.demo.application.ports.input.EmployeeServicePort;
import com.siscon.demo.application.ports.output.EmployeePersistencePort;
import com.siscon.demo.domain.exception.EmployeeNotFoundException;
import com.siscon.demo.domain.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService implements EmployeeServicePort {

    private final EmployeePersistencePort persistencePort;

    @Override
    public Employee findById(Integer idEmployee) {
        return persistencePort.findById(idEmployee).orElseThrow(EmployeeNotFoundException::new);
    }

    @Override
    public List<Employee> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return persistencePort.save(employee);
    }

    @Override
    public Employee update(Integer idEmployee, Employee employee) {
        return persistencePort.findById(idEmployee)
                .map(savedEmployee -> {
                    savedEmployee.setFirstname(employee.getFirstname());
                    savedEmployee.setMiddlename(employee.getMiddlename());
                    savedEmployee.setLastname(employee.getLastname());
                    savedEmployee.setSecondsurname(employee.getSecondsurname());
                    savedEmployee.setAge(employee.getAge());
                    savedEmployee.setGender(employee.getGender());
                    savedEmployee.setBirthdate(employee.getBirthdate());
                    savedEmployee.setPosition(employee.getPosition());
                    return persistencePort.save(savedEmployee);
                })
                .orElseThrow(EmployeeNotFoundException::new);
    }
}
