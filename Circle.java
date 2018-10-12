import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr= new Scanner(System.in);
		float radius,area;
		System.out.println("What is the  radius of the cirlce?");
		radius = scnr.nextFloat();
		
		area = (float) ( radius*radius*Math.PI);
		System.out.println("The radius of the circle is "+ radius+" and the area of the circle is "+ area);
	}

}