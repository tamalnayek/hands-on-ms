package com.service.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.emp.exception.EmployeeNotFoundException;
import com.service.emp.model.Employee;
import com.service.emp.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	public List<Employee> findAllEmplopees() {
		return empRepository.findAll();
	}

	public Employee findEmpById(Integer id) {
		Optional<Employee> emp = empRepository.findById(id);
		if (!emp.isPresent())
			throw new EmployeeNotFoundException("This employee (id=" + id + ") not found in Records 1!");
		return emp.get();
	}
	
	public List<Employee> findEmployeesByFName(String fname){
		List<Employee> emp = empRepository.findByFirstName(fname);
		if(emp.isEmpty() || emp ==null) {
			throw new EmployeeNotFoundException("No matching records found !");
		}
		return emp;
	}
	
	public List<Employee> findEmployeesContainsFName(String fname){
		List<Employee> emp = empRepository.findByFirstNameContaining(fname);
		if(emp.isEmpty() || emp ==null) {
			throw new EmployeeNotFoundException("No matching records found !");
		}
		return emp;
	}
	
	public List<Employee> findEmployeesByLName(String lname){
		List<Employee> emp = empRepository.findBySurname(lname);
		if(emp.isEmpty() || emp ==null) {
			throw new EmployeeNotFoundException("No matching records found !");
		}
		return emp;
	}

}
