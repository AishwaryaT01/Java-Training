import java.util.Scanner;
public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
	}
	static void prime (int num1)
	{
		int count=0;
		int sqrt=(int) ( Math.sqrt(num1));
		if (count==0)
		for(int i=2;i<=(sqrt);i++)
		{
			if(num1%i==0){
				count=1;
				break;}
				else
					count=0;
		}
		if (count==0){
			if(num1==1)
				System.out.println("1 is neither prime nor composite");		
			else
			System.out.println(num1+" is a prime number");
					
				}
		else
			System.out.println(num1+" is not a prime number");
	}
	static void amstrongRange(){}
}
