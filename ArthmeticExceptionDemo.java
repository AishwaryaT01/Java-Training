import java.util.Scanner;
public class ArthmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend,divisor,quotient=0;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter dividend");
		dividend=scnr.nextInt();
		System.out.println("Enter divisor");
		divisor=scnr.nextInt();
		//get quotient
		try{
		quotient=dividend/divisor;
		}catch(ArithmeticException arex){
			System.err.println("Division by zero is invalid");
			System.err.println(arex.getMessage());
			if(arex.getMessage().equals("/ by zero")){
				System.err.println("Arithemtic exception thrown");			}
		}
		System.out.println(quotient);

		
	}

	
}
