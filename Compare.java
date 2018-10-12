import java.util.Scanner;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num1,num2,num3,large;
		System.out.println("Enter three numbers ");
		num1= input.nextInt();
		num2= input.nextInt();
		num3= input.nextInt();
		large = num1;
		if (large<num2)
			{large=num2;}
		if(large<num3){
			large=num3;}
		System.out.println(large + " is the largest number.");
}
}