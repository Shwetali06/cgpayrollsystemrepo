package com.cg.payroll.bean;

public class Employee {
	private int emp_id;
	private String firstName,lastName,email_id,pan_card,department,designation;
	private BankDetails bankDetail;
	private Salary salary;
	public Employee(){}
	public Employee(int emp_id, String firstName, String lastName, String email_id, String pan_card, String department,
			String designation, BankDetails bankDetail, Salary salary) {
		super();
		this.emp_id = emp_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email_id = email_id;
		this.pan_card = pan_card;
		this.department = department;
		this.designation = designation;
		this.bankDetail = bankDetail;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPan_card() {
		return pan_card;
	}
	public void setPan_card(String pan_card) {
		this.pan_card = pan_card;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public BankDetails getBankDetail() {
		return bankDetail;
	}
	public void setBankDetail(BankDetails bankDetail) {
		this.bankDetail = bankDetail;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	}
