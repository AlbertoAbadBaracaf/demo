package com.siscon.demo.infrastructure.adapters.output.persistence;

import com.siscon.demo.application.ports.output.EmployeePersistencePort;
import com.siscon.demo.domain.model.Employee;
import com.siscon.demo.infrastructure.adapters.output.persistence.mapper.EmployeePersistenceMapper;
import com.siscon.demo.infrastructure.adapters.output.persistence.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EmployeePersistenceAdapter implements EmployeePersistencePort {
    private final EmployeeRepository repository;
    private final EmployeePersistenceMapper mapper;

    @Override
    public Optional<Employee> findById(Integer idEmployee) {
        return repository.findById(idEmployee)
                .map(mapper::toEmployee);
    }

    @Override
    public List<Employee> findAll() {
        return mapper.toEmployeeList(repository.findAll());
    }

    @Override
    public Employee save(Employee employee) {
        return mapper.toEmployee(
                repository.save(mapper.toEmployeeEntity(employee)));
    }
}
