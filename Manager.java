package com.deloitte.company;
public class Manager extends Employee {
	int teamSize;
public	Manager(int id, String name,float salary, int teamSize){
		//call super class constructor
		super(id,name,salary);
		this.teamSize=teamSize;
		
	}
	public void showTeamSize(){
		System.out.println("Team size:"+teamSize);
	}
	public void computeHra(){
		hra=salary*0.20f;
		System.out.println("HRA of Manager"+hra);
	}

}
