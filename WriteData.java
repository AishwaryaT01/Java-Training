import java.io.*;
public class WriteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileWriter fw=new FileWriter("E:\\myfile.txt");
			fw.write("Welcome to Deloitte");
			fw.close();
		}catch(Exception ex){
			System.err.println(ex.getMessage());
		}
		System.out.println("Success!");
	}

}
