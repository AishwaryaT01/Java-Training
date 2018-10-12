import java.util.Scanner;
public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int sidea,sideb,sidec,temp;
		System.out.println("Enter the sides of the triangle ");
		sidea=input.nextInt();
		sideb=input.nextInt();
		sidec=input.nextInt();
		temp=sidea;
		if((sidea==sideb)&&(sidea==sidec))
			System.out.println("The triangle is an equilateral triangle");
		else if((sidea==sideb)||(sideb==sidec)||(sidec==sidea))
			System.out.println("The triangle is and isocles triangle");
		else
			System.out.println("The triangle is and scalene triangle");
		
	}

}
