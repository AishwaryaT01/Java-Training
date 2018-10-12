
public class IndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[]={52,69,54};
		try{
			System.out.println(prices[2]);
			System.out.println(62/10);	
			String str=null;
			System.out.println(str.length());
		}catch(Exception excp){
			System.err.println(excp.getMessage());
		}

	}

}
