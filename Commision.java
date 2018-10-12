import java.util.Scanner;
public class Commision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sales,comm=500,diff1,diff2,diff3;
		System.out.println("Enter the sales amount ");
		sales= input.nextInt();
		if(sales<=10000)
		{
			System.out.println("The sales amount is "+sales+" and the comminsion amout is Rs"+comm);
		}
		diff1=sales-10000;
		if((diff1<=2000)&&(diff1>0)){
			comm+=((diff1)*(0.10));
			System.out.println("The sales amount is "+sales+" and the commision amount is"+comm);
		}
		diff2=diff1-2000;
		if ((diff2<=3000)&&(diff2>0)){
			comm+=((2000)*(0.10))+((diff2)*(0.15));
			System.out.println("The sales amount is "+sales+" and the commision amount is "+comm);
		}
		else{
			diff3=diff2-3000;
			if(diff3>0){
			comm+=((2000)*(0.10))+((3000)*(0.15))+((diff3)*(0.20));
			System.out.println("The sales amout is "+sales+" and the commision amout is"+comm);
		}
	  }
	}

}
