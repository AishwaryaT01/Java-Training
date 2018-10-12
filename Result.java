import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sign=-1,num;
		float sum=0;
		System.out.println("Enter a number");
		num=input.nextInt();
		for(int i=1;i<=num;i+=2){
			sign=sign*(-1);
			sum+=(float)(sign*4.0/num);
		}
		System.out.println("Result "+ sum);
	}

}
