package com.service.staff.api.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.staff.api.model.Employee;


@FeignClient(name = "emp-service", fallback = EmpServiceProxyImpl.class)
public interface EmpServiceProxy {
	
	@GetMapping("/find/employees")
	public List<Employee> getAllEmps();

}
