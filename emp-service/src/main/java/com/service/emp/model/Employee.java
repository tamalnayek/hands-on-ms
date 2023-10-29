package com.service.emp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "surname")
	private String surname;
	@Column(name = "birthdate")
	private String birthdate;
	@Column(name = "homeaddress")
	private String homeAddress;
	@Column(name = "officelocation")
	private String officeLocation;
	@Column(name = "officephone")
	private String officePhone;
	@Column(name = "title")
	private String title;
	@Column(name = "salary")
	private Integer salary;
	@Column(name = "taxfilenumber")
	private Integer taxFileNumber;
	
	
			
	public Employee(Integer id, String firstName, String surname, String birthdate, String homeAddress,
			String officeLocation, String officePhone, String title, Integer salary, Integer taxFileNumber) {		
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.birthdate = birthdate;
		this.homeAddress = homeAddress;
		this.officeLocation = officeLocation;
		this.officePhone = officePhone;
		this.title = title;
		this.salary = salary;
		this.taxFileNumber = taxFileNumber;
	}	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


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
