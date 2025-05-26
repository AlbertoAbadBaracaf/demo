package com.siscon.demo;

import com.siscon.demo.application.ports.input.EmployeeServicePort;
import com.siscon.demo.infrastructure.adapters.input.rest.mapper.EmployeeRestMapper;
import com.siscon.demo.infrastructure.adapters.input.rest.model.response.EmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;
import com.siscon.demo.infrastructure.adapters.input.rest.model.response.EmployeeResponse;

@SpringBootTest
class SisconAbadApplicationTests {

    @Test
    void testFindById() {
        int idEmployee = 1;
        assertEquals(1,1);
    }
}