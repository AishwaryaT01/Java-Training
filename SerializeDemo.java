package com.deloitte.iostreams.serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		emp.name="Anirudh";
		emp.address="Jubliee Hills,Hyd";
		emp.SSN=11111;
		emp.number=101;
		try{
			FileOutputStream fileOut= new FileOutputStream("employee.ser");
			ObjectOutputStream out= new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.println("Employee object data written to file");
		}catch(IOException ioex){
			ioex.printStackTrace();
		}
			
		}

	}

