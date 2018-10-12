import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class BookDataReader {


		Connection conn;
		Statement stmt;
		ResultSet rset;
		public void registerDriver()throws Exception{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		public void getDetails() throws Exception{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL1","scott","tiger");
			stmt=conn.createStatement();
			
			
			rset=stmt.executeQuery("select * from book");
			while(rset.next()){//retrives a row from rset object
				int bookId;
				String bookName;
				String author;
				float price;
				//get the row details
				bookId=rset.getInt(1);
				bookName=rset.getString(2);
				author=rset.getString(3);
				price=rset.getFloat(4);
				System.out.println(bookId+" "+bookName+" "+author+" "+price);
			}
			rset.close();
		}
		
		

	}


