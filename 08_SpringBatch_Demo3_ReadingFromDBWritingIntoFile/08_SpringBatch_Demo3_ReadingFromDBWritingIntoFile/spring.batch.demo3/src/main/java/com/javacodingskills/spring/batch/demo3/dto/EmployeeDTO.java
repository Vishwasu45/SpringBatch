package com.javacodingskills.spring.batch.demo3.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

}