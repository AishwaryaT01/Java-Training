import java.util.Scanner;
public class VowelsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a word ");
		String str=input.nextLine();
		String wordSplit[]=str.split("");
		for(int index=0;index<wordSplit.length;index++)
		{
		if((wordSplit[index].equalsIgnoreCase("a"))||(wordSplit[index].equalsIgnoreCase("e"))||(wordSplit[index].equalsIgnoreCase("i"))||(wordSplit[index].equalsIgnoreCase("o"))||(wordSplit[index].equalsIgnoreCase("u")))	
			count+=1;	
		}
		System.out.println("The number of vowels in the string are "+count);
	}

}
