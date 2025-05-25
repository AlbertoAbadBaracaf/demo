package com.siscon.demo.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {
    EMPLOYEE_NOT_FOUND("ERR_EMPLOYEE_001", "Employee not found."),
    INVALID_EMPLOYEE("ERR_EMPLOYEE_002", "Invalid employee parameters."),
    GENERIC_ERROR("ERR_GEN_001", "An unexpected error occurred.");

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
