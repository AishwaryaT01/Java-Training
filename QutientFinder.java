import java.util.Scanner;
public class QutientFinder {
	int dividend,divisor,quotient;
	
	Scanner scnr=new Scanner(System.in);
	public void readDividend(){
		System.out.println("Enter dividend");
		dividend=scnr.nextInt();
		
	}
	public void readDivisor(){
		System.out.println("Enter Divisor");
		divisor=scnr.nextInt();
	}
	public void getQuotient(){
		
		try{
			quotient=dividend/divisor;
			System.out.println("Quotient="+quotient);}
		catch(ArithmeticException aexcp){
			System.err.println("divisor is zero...please reenter divisor");
			readDivisor();
			getQuotient();}
	}
}
