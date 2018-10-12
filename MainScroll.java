import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MainScroll {
	
	public static void main(String[] args) throws ClassNotFoundException{
	Statment stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=stmt.executeQuery("select * from Dept");
	//reading from bottom to top
	rs.afterLast();
		while(rs.previous()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

		}
	}
}
