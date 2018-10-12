
//persistence layer
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*import com.deloitte.library.helper.ConnectToDB;
import com.deloitte.library.pojo.Bank;//*/
public class BankDAO {
	//JDBC API classes for dat retrival
	private Connection connection =null;
	private PreparedStatement statement=null;
	private ResultSet resultSet=null;
	
	Bank Bank;//=new Bank();
	ArrayList<Bank> BankList=new ArrayList<Bank>();
	String BankQry="select * from Banks";
	
	public ArrayList<Bank> getBanks()
		throws ClassNotFoundException,SQLException{
		try{
			//open the connection
			connection=ConnectToDB.createConnection();
			//create statement
			statement=connection.prepareStatement(BankQry);
			//get result
			resultSet=statement.executeQuery();
			Bank bank;
			while(resultSet.next()){
				//create the pojo
				bank=new Bank();
				// set the pojo with retrieved values from the row
				bank.setId(resultSet.getInt(1));
				bank.setAccHldrName(resultSet.getString(2));
				bank.setMobileNo(resultSet.getLong(3));
				bank.setBalance(resultSet.getFloat(4));
				//Bank object is filled with data
				//add the Bank to Banklist
				BankList.add(Bank);
				Bank=null;
			}//end while loop
			
		}catch(SQLException sqlex){
			
		}finally{
			//close connection
			//now data is in array list object no need to keep the 
			ConnectToDB.closeConnection();
		}
		return BankList;
	}
public void showBankList(ArrayList<Bank> BankList){
	for(Bank Bank:BankList){
		System.out.println(Bank.getId());
		System.out.println(Bank.getAccHldrName());
		System.out.println(Bank.getMobileNo());
		System.out.println(Bank.getBalance());
	}
}

public void addBankDetails(Bank banks[]) throws SQLException {
	for(int index = 0; index < banks.length;index++) {
	 Connection conn = null;
	PreparedStatement pstmt = conn.prepareStatement("insert into BANKONE values(?,?,?,?)");
			pstmt.setInt(1,banks[index].getId());
			pstmt.setString(2,banks[index].getAccHldrName());
			pstmt.setLong(3,banks[index].getMobileNo());
			pstmt.setFloat(4,banks[index].getBalance());
		
			
		
}

}
}