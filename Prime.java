import java.util.Scanner;
import java.math.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num1,sqrt,count=0;
		boolean isPrime=true;
		System.out.println("Enter a number ");
		num1= input.nextInt();
		sqrt=(int) ( Math.sqrt(num1));
		for(int divisor=2;divisor<=(sqrt);divisor++)
		{
			if(num1%divisor==0){
				isPrime=false;
				break;}
		}
		if (isPrime){
			if(num1==1)
				System.out.println("1 is neither prime nor composite");		
			else
			System.out.println(num1+" is a prime number");
					
				}
		else
			System.out.println(num1+" is a composite number");
	}

}
