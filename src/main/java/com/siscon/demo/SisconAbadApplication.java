package com.siscon.demo;

import com.siscon.demo.infrastructure.adapters.output.persistence.entity.EmployeeEntity;
import com.siscon.demo.infrastructure.adapters.output.persistence.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class SisconAbadApplication implements CommandLineRunner {

	private final EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SisconAbadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<EmployeeEntity> entities = Arrays.asList(
				new EmployeeEntity(null, "Alberto", "Arturo","Abad","Varela", 28, "Masculino", LocalDate.parse("1985-11-13"),"Desarrollador")
		);
		repository.saveAll(entities);
	}

}
