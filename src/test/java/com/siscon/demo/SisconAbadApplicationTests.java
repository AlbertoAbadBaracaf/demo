package com.siscon.demo;

import com.siscon.demo.application.ports.input.EmployeeServicePort;
import com.siscon.demo.infrastructure.adapters.input.rest.mapper.EmployeeRestMapper;
import com.siscon.demo.infrastructure.adapters.input.rest.model.response.EmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;
import com.siscon.demo.infrastructure.adapters.input.rest.model.response.EmployeeResponse;

@SpringBootTest
@RequiredArgsConstructor
class SisconAbadApplicationTests {
	private final EmployeeRestMapper restMapper;
	private final EmployeeServicePort servicePort;

	@Test
	void testFindById() {
		int idEmployee = 1;
		EmployeeResponse response= restMapper.toEmployeeResponse(servicePort.findById(idEmployee));

	}

}
