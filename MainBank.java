
import java.sql.SQLException;
import java.util.Scanner;
	public class MainBank {

		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			Bank bank[]=new Bank[10];

			for(int index=1;index<=10;index++){
				
				System.out.println("Enter the ID,Account Holder Name,Mobile Number,Account Balance of person "+ index);
				int id= input.nextInt();
				input.nextLine();
				String AccHldrName=input.nextLine();
				Double MobileNo=input.nextDouble();
				input.nextLine();
				float balance= input.nextFloat();
				bank[index]= new Bank();
				
			}
			BankDAO bankDao = new BankDAO();
			bankDao.addBankDetails(bank);
			
		}
	}
