package com.angulardemo.spring.angularDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "http://localhost:4200")

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

}
