package com.service.staff.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.staff.api.model.Employee;
import com.service.staff.api.service.StaffLocationService;

@RestController
@RequestMapping("/api")
public class StaffLocationController {
	
	private final static Logger logger = LoggerFactory.getLogger(StaffLocationController.class);

	@Autowired
	private StaffLocationService staffLocationService;

	@GetMapping("/v1/find/employees/{fname}")
	public List<Employee> getStaffByFirstName_V1(@PathVariable String fname) {
		logger.info("*** Inside <staff-api> Controller to getStaffByFirstName_V1(fname)");
		return staffLocationService.findEmployeesByFname(fname);
	}	
	
	@GetMapping("/v1/find/employees")
	public List<Employee> getAllStaff_V1() {
		logger.info("*** Inside <staff-api> Controller to getAllStaff_V1()");
		return staffLocationService.findEmployees();
	}	
	
}
