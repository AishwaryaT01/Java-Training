import java.util.Scanner;
import java.math.*;
public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num1,temp,count=0,sum=0,a=0;
		System.out.println("Enter a number ");
		num1=input.nextInt();
		if((num1<10000)&&(num1!=0)){
			temp=num1;
		
			while(temp>0){
				a=( temp %10);
				sum=sum+(int)( Math.pow(a, 3));
				temp=(int)(temp/10);
					}
			if(num1==sum)
				System.out.println("The number is an amstrong number");
			else
				System.out.println("The number is not an amstrong number");
		}
		else
			System.out.println("The number is not valid");
	}

}
