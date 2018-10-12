package com.deloitte.iostreams.serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;


public class DeserializationDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee emp=null;
		FileInputStream fileIn= new FileInputStream("employee.ser");
		ObjectInputStream in=new ObjectInputStream(fileIn);
		emp=(Employee) in.readObject();//reference type
		in.close();
		fileIn.close();
		System.out.println("Name:"+emp.name);
		System.out.println("Address:"+emp.address);
		System.out.println("SSN"+emp.SSN);
		System.out.println("Number"+emp.number);

	}

}
