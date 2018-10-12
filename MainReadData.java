
public class MainReadData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BookDataReader bdr=new BookDataReader();
		bdr.registerDriver();
		bdr.getDetails();
	}

}
