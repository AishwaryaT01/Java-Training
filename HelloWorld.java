import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Hello!");
		System.out.print("What is is your name? ");
		String name =input.next();
		System.out.println("Hello "+ name);

	}

}
