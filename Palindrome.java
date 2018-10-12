import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str=input.nextLine();
		StringBuilder strBldr=new StringBuilder(str);		
		StringBuilder str1=strBldr.reverse();
		String str2=str1.toString();
		if(str.equals(str2))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		

	}

}
