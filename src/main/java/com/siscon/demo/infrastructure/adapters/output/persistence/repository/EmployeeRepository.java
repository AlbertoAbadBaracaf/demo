package com.siscon.demo.infrastructure.adapters.output.persistence.repository;

import com.siscon.demo.infrastructure.adapters.output.persistence.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<EmployeeEntity, Integer>{
}
