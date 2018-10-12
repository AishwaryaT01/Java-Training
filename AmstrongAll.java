import java.util.Scanner;
import java.math.*;
public class AmstrongAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int temp,sum=0,a=0;
		for (int count=1;count<10000;count++){
			sum=0;
			temp=count;
			while(temp>0){
				a=( temp %10);
				sum=sum+(int)( Math.pow(a, 3));
				temp=(int)(temp/10);
					}
			if(sum==count)
				System.out.println(count);
		}	
		

}
}