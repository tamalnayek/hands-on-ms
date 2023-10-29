package com.service.staff.web.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.service.staff.web.model.Employee;




@FeignClient(name = "staff-api", fallback = EmpServiceProxyImpl.class)
public interface EmpServiceProxy {
	
	@GetMapping("/api/v1/find/employees/{fname}")
	public List<Employee> getStaffByFirstName_V1(@PathVariable String fname);
	
	@GetMapping("/api/v1/find/employees")
	public List<Employee> getAllStaff_V1();

}
