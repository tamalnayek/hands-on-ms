package com.service.staff.web.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.service.staff.web.model.Employee;

@Component
public class EmpServiceProxyImpl implements EmpServiceProxy {

	@Override
	public List<Employee> getStaffByFirstName_V1(String fname) {
		List<Employee> emptyList = new ArrayList<>();
		return emptyList;
	}

	@Override
	public List<Employee> getAllStaff_V1() {		
		return new ArrayList<>();
	}

}
