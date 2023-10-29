package com.service.emp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.emp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	List<Employee> findByFirstName(String firstName);
	List<Employee> findByFirstNameContaining(String firstName);
	List<Employee> findBySurname(String surname);
	List<Employee> findByTitle(String title);
	List<Employee> findBySalary(Integer salary);
	List<Employee> findByTaxFileNumber(Integer taxFileNumber);

}
