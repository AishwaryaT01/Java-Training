import java.io.*;
public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		FileReader fr= new FileReader("E:\\myfile.txt");
		int ch;
		while((ch=fr.read())!=-1){
			
			System.out.print((char)ch);
		}
		fr.close();
	}

}
