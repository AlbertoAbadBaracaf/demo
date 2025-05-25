package com.siscon.demo.infrastructure.adapters.input.rest;

import com.siscon.demo.application.ports.input.EmployeeServicePort;
import com.siscon.demo.infrastructure.adapters.input.rest.mapper.EmployeeRestMapper;
import com.siscon.demo.infrastructure.adapters.input.rest.model.request.EmployeeCreateRequest;
import com.siscon.demo.infrastructure.adapters.input.rest.model.response.EmployeeResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeRestAdapter {
    private final EmployeeServicePort servicePort;
    private final EmployeeRestMapper restMapper;

    @GetMapping("/v1/api")
    public List<EmployeeResponse> findAll() {
        return restMapper.toEmployeeResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{idEmployee}")
    public EmployeeResponse findById(@PathVariable Integer idEmployee) {
        return restMapper.toEmployeeResponse(servicePort.findById(idEmployee));
    }

    @PostMapping("/v1/api")
    public ResponseEntity<EmployeeResponse> save(@Valid @RequestBody EmployeeCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toEmployeeResponse(
                        servicePort.save(restMapper.toEmployee(request))));
    }

    @PutMapping("/v1/api/{id}")
    public EmployeeResponse update(@PathVariable Integer idEmployee, @Valid @RequestBody EmployeeCreateRequest request) {
        return restMapper.toEmployeeResponse(
                servicePort.update(idEmployee, restMapper.toEmployee(request)));
    }
}
