package com.service.emp.exception;

public class EmployeeNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 5532887126288778282L;
	
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}

}
