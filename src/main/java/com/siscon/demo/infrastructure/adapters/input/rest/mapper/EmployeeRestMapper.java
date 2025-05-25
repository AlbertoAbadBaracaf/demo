package com.siscon.demo.infrastructure.adapters.input.rest.mapper;

import com.siscon.demo.domain.model.Employee;
import com.siscon.demo.infrastructure.adapters.input.rest.model.request.EmployeeCreateRequest;
import com.siscon.demo.infrastructure.adapters.input.rest.model.response.EmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeRestMapper {
    Employee toEmployee(EmployeeCreateRequest request);

    EmployeeResponse toEmployeeResponse(Employee employee);

    List<EmployeeResponse> toEmployeeResponseList(List<Employee> employeeList);
}
