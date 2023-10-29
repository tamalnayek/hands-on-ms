package com.service.staff.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.staff.api.exception.StaffNotFoundException;
import com.service.staff.api.model.Employee;
import com.service.staff.api.proxy.EmpServiceProxy;

@Service
public class StaffLocationService {

	private final static Logger logger = LoggerFactory.getLogger(StaffLocationService.class);

	@Autowired
	private EmpServiceProxy proxy;

	public List<Employee> findEmployeesByFname(String fname) {
		List<Employee> empList = proxy.getAllEmps();
		logger.info("*** Inside <staff-api> >> StaffLocationService.class getAllList() in Respose = " + empList);

		if (empList == null || empList.isEmpty()) {
			throw new StaffNotFoundException("Record Not Found !");
		}
		// Fetch matched records from all employees list.
		List<Employee> emps = empList.stream().filter(s -> s.getFirstName().contains(fname))
				.collect(Collectors.toList());
		logger.info("*** Inside <staff-api> >> StaffLocationService.class filter empList based on search = " + emps);

		if (emps == null || emps.isEmpty()) {
			throw new StaffNotFoundException("Record Not Found !");
		}
		return emps;
	}

	public List<Employee> findEmployees() {
		List<Employee> empList = proxy.getAllEmps();
		logger.info("*** Inside <staff-api> >> StaffLocationService.class findEmployees() in Respose = " + empList);
		if (empList == null || empList.isEmpty()) {
			throw new StaffNotFoundException("Record Not Found !");
		}
		return empList;
	}

}
