import java.util.Scanner;
public class Fibonaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sum=0,num1=0,num2=1,num3;
		boolean isF=false;
		System.out.println("Enter a number");
		num3= input.nextInt();
		sum=num1+num2;
		while (sum<=num3)
		{   if(sum==num3)
		   {
			isF=true;
			break;}
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}
		if(isF)
			System.out.println("The number is a Fibonacci number");
		else
			System.out.println("The number is not a Fibonnacci number");
	}

}
