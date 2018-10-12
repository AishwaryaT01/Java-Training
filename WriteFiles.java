import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fop=new FileOutputStream("emp.txt");
		String str="1234,Kumar,Manager,56321.25\n";
		String str2="1235,Prakash,Officer,76218.25";
		
		fop.write(str.getBytes());
		fop.write(str2.getBytes());
		
		fop.flush();
		fop.close();
		
		System.out.println("The data has been written");
		

	}

}
