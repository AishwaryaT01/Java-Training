import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sum=0,num1=0,num2=1;
		System.out.println(num1);
		System.out.println(num2);
		sum=num1+num2;
		while (sum<100)
		{    
			System.out.println(sum);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}
	}

}
