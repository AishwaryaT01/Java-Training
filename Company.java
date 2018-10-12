package com.deloitte.company.ui;
import com.deloitte.company.Employee;
import com.deloitte.company.Manager;
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee kumar= new Employee(1001,"Kumar",36532.12f);
		Employee prakash=new Manager(1005,"Prakash",45263.25f,25);
		kumar.login();
		kumar.logout();
		kumar.computeHra();
		prakash.login();
		prakash.logout();
		prakash.computeHra();
		System.out.println("Company Name:"+Employee.companyName);
		Employee.companyName="Deloitte - Hyderabad";
		System.out.println("Company Name:"+Employee.companyName);
		
	}

}
