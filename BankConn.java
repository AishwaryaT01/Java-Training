import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class BankConn {


		Connection conn;
		Statement stmt;
		ResultSet rset;
		public void registerDriver()throws Exception{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		public void createTable() throws Exception{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL1","scott","tiger");
			System.out.println("Creating table in given database...");
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE TABLE BANKONE " +
		                   "(id INTEGER not NULL, " +
		                   " accHldrName VARCHAR(255), " + 
		                   " moblieNO NUMBER(12), " + 
		                   " balance NUMBER(7,2), " + 
		                   " PRIMARY KEY ( id ))"; 

		      stmt.executeUpdate(sql);
		      System.out.println("Created table in given database...");

			
			/*while(rset.next()){//retrives a row from rset object
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
			}*/
			rset.close();
		}
		
		
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			BankConn bank=new BankConn();
			bank.registerDriver();
			bank.createTable();
		}


	}


