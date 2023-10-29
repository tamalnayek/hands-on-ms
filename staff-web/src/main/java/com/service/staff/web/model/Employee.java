package com.service.staff.web.model;

public class Employee {
	
	private Integer id;	
	private String firstName;	
	private String surname;	
	private String birthdate;	
	private String homeAddress;	
	private String officeLocation;	
	private String officePhone;	
	private String title;	
	private Integer salary;	
	private Integer taxFileNumber;
			
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getTaxFileNumber() {
		return taxFileNumber;
	}
	public void setTaxFileNumber(Integer taxFileNumber) {
		this.taxFileNumber = taxFileNumber;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", surname=" + surname + ", birthdate=" + birthdate
				+ ", homeAddress=" + homeAddress + ", officeLocation=" + officeLocation + ", officePhone=" + officePhone
				+ ", title=" + title + ", salary=" + salary + ", taxFileNumber=" + taxFileNumber + "]";
	}	
	
	
}
