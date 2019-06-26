package com.cg.payroll.bean;

public class Salary {
int basicSalary,hra,conveyanceAllowance,otherAllowance;
int personalAllowance,monthlyTax,epf,companyPf,netSalary;
public Salary(){}
public Salary(int basicSalary, int hra, int conveyanceAllowance, int otherAllowance, int personalAllowance,
		int monthlyTax, int epf, int companyPf) {
	super();
	this.basicSalary = basicSalary;
	this.hra = hra;
	this.conveyanceAllowance = conveyanceAllowance;
	this.otherAllowance = otherAllowance;
	this.personalAllowance = personalAllowance;
	this.monthlyTax = monthlyTax;
	this.epf = epf;
	this.companyPf = companyPf;
	this.netSalary = netSalary;
}
public int getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(int basicSalary) {
	this.basicSalary = basicSalary;
}
public int getHra() {
	return hra;
}
public void setHra(int hra) {
	this.hra = hra;
}
public int getConveyanceAllowance() {
	return conveyanceAllowance;
}
public void setConveyanceAllowance(int conveyanceAllowance) {
	this.conveyanceAllowance = conveyanceAllowance;
}
public int getOtherAllowance() {
	return otherAllowance;
}
public void setOtherAllowance(int otherAllowance) {
	this.otherAllowance = otherAllowance;
}
public int getPersonalAllowance() {
	return personalAllowance;
}
public void setPersonalAllowance(int personalAllowance) {
	this.personalAllowance = personalAllowance;
}
public int getMonthlyTax() {
	return monthlyTax;
}
public void setMonthlyTax(int monthlyTax) {
	this.monthlyTax = monthlyTax;
}
public int getEpf() {
	return epf;
}
public void setEpf(int epf) {
	this.epf = epf;
}
public int getCompanyPf() {
	return companyPf;
}
public void setCompanyPf(int companyPf) {
	this.companyPf = companyPf;
}
public int getNetSalary() {
	return netSalary;
}
public void setNetSalary(int netSalary) {
	this.netSalary = netSalary;
}

}
