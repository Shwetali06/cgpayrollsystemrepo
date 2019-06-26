package com.cg.payroll.main;
import com.cg.payroll.bean.BankDetails;
import com.cg.payroll.bean.Employee;
import com.cg.payroll.bean.Salary;
public class MainClass {
public static void main(String[] args) {
	BankDetails b=new BankDetails(890, "state bank", "sbi345");
	Salary s=new Salary(10000, 120,450, 550, 720, 100,100, 100);
	Employee e=new Employee(11,"SHWETALI","RASAL","shwetali@gmail.com","YTH123","IT","SE",b,s);
System.out.println(e.getSalary().getBasicSalary());
		}
}
