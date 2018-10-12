import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL1","scott","tiger");
		PreparedStatement pstmt=con.prepareStatement("insert into Dept values(?,?,?)");
		pstmt.setInt(1, 70);//specifies the first?
		pstmt.setString(2, "TRANSPORT");
		pstmt.setString(3, "SYDNEY");
		int rows=pstmt.executeUpdate();
		System.out.println(rows+" records inserted");
		con.commit();
		con.close();
	}

}
