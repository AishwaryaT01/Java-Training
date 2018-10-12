import java.util.Scanner;
public class SumInfinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int sum=0,count,num;
		System.out.println("value" +5+2);
		System.out.println("Enter numbers ");
		num=input.nextInt();
		
		while(num>0){
			sum=sum+num;
			num= input.nextInt();	
		}
		System.out.println("The sum of all the positve numbers is "+sum);
	}

}
