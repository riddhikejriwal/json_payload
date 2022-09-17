package com.example.jsonpayload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsonpayload.model.Employee;

@RestController
public class EmployeeController {
	@PostMapping("/emp")
    public void insertRecord(@RequestBody Employee employee) {
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAddress());
	}
}
