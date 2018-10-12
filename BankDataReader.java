
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BankDataReader {
	
	Connection conn;
	Statement stmt;
	ResultSet rset;

    
	public void registerDriver() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	
	public void getDetails()throws Exception{
		conn= DriverManager.getConnection("jdbc:oracle:thin:@192.168.4.28:1521:ORCL1","scott", "tiger");
		
		stmt = conn.createStatement(); //statement object -- to execute the select
		rset=stmt.executeQuery("select*from BANKONE");
		
		while(rset.next())
		{
			
			int id;
			String accHldrName;
			int mobileNo;
			float balance;
			
			//get the row details
			id = rset.getInt(1);
			accHldrName=rset.getString(2);
			mobileNo= rset.getInt(3);
			balance= rset.getFloat(4);
			
			System.out.println(id+" "+accHldrName+" "+mobileNo+" "+balance);
		}
		
		rset.close();
		
	}

}

