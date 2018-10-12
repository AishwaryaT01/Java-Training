import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException{
		
		FileInputStream finp=new FileInputStream("emp.txt");
		byte data;
		do{
			
			data=(byte)finp.read();
			if(data!=-1){
			System.out.print((char)data);}
		}
		while(data!=-1);
			finp.close();
	}
	
	
}
