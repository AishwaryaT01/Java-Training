
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectToDB {
	//New instance of Connection
	private static Connection connection=null;
	//Opening connection with ORACLE database
	public static Connection createConnection() throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection=DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:ORCL1",
				"scott","tiger");
		return connection;
	}
	//close connection
	public static void closeConnection() throws SQLException{
		connection.close();
	}
	

}
