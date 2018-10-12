import java.util.Scanner;
public class ArrayFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] scores= new float[10];
		float sum=0,evensum=0;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter 10 scores!");
		//read values
		for (int index=0;index<10;index++){
			scores[index]=scnr.nextFloat();
			sum+=scores[index];
		}
		//display the sum
		System.out.println("The sum of the scores is "+sum);
		
		for(int index1=0;index1<10;index1++)
		{
			if(scores[index1]%2.0==0)
				evensum+=scores[index1];
		}
		System.out.println("The sum of the even scores is "+evensum);
	}

}
