package com.service.emp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.emp.model.Employee;
import com.service.emp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService empService;

	@GetMapping("/find/{fname}")
	public List<Employee> getEmpsByFirstName(@PathVariable String fname) {
		logger.info("*** Inside emp-service Controller to getEmpsByFirstName(fname)");
		return empService.findEmployeesByFName(fname);
	}
	
	@GetMapping("/find/fnamecontains")
	public List<Employee> getEmpsByContainsFirstName(@RequestParam String fname) {
		logger.info("*** Inside emp-service Controller to getEmpsByContainsFirstName(fname)");
		return empService.findEmployeesContainsFName(fname);
	}
	
	@GetMapping("/find/employees")
	public List<Employee> getAllEmps() {
		logger.info("*** Inside emp-service Controller to getAllEmps()");
		return empService.findAllEmplopees();
	}
}
