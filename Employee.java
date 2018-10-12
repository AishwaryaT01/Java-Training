package com.deloitte.company;
public  class Employee  {
private int id;
private String name;
float salary,hra;
public static String companyName="Deloitte";
final long tollFreeNo=18002563522L;
public Employee(int id, String name,float salary){
	this.setId(id);
	this.setName(name);
	this.salary=salary;
}
public void login(){
	System.out.println("In the login method");
}
public void logout(){
	System.out.println("In the logout method");
}
public  void computeHra(){
	hra=salary*0.10f;
	System.out.println("Employee HRA"+ hra);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
