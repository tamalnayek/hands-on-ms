package com.service.staff.web.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.staff.web.model.Employee;
import com.service.staff.web.proxy.EmpServiceProxy;


@Service
public class StaffWebService {
	
	private final static Logger logger = LoggerFactory.getLogger(StaffWebService.class);

	@Autowired
	private EmpServiceProxy proxy;
	
	public List<Employee> findEmployeesByFname(String fname) {
		List<Employee> empList = proxy.getStaffByFirstName_V1(fname);		
		logger.info("*** Inside <staff-web> >> StaffWebService.class getFindList() in Respose = "+empList);		
		return empList;
	}
	
	public List<Employee> fetchAllEmployees(){
		logger.info("*** Inside <staff-web> >> StaffWebService.class fetchAllEmployees()***");
		return proxy.getAllStaff_V1();
	}

}
