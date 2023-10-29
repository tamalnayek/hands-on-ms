package com.service.staff.api.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.service.staff.api.model.Employee;

@Component
public class EmpServiceProxyImpl implements EmpServiceProxy {

	@Override
	public List<Employee> getAllEmps() {
		return new ArrayList<>();
	}

	

}
