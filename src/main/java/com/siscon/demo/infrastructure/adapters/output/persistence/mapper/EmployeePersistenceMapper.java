package com.siscon.demo.infrastructure.adapters.output.persistence.mapper;

import com.siscon.demo.domain.model.Employee;
import com.siscon.demo.infrastructure.adapters.output.persistence.entity.EmployeeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeePersistenceMapper {
    EmployeeEntity toEmployeeEntity(Employee employee);

    Employee toEmployee(EmployeeEntity entity);

    List<Employee> toEmployeeList(List<EmployeeEntity> entityList);
}
