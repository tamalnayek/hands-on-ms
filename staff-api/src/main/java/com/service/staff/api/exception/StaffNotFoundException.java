package com.service.staff.api.exception;

public class StaffNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 5532887126288778282L;
	
	public StaffNotFoundException(String msg) {
		super(msg);
	}

}
