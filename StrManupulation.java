
public class StrManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome ";
		int length;
		length=str.length();
		System.out.println("length of the sting is "+length);
		char ch;
		ch = str.charAt(2);
		System.out.println("The Character is "+ch);
		System.out.println(str.endsWith("me"));
		System.out.println(str.startsWith("W"));
		System.out.println(str.substring(2, 5));
		String str2;
		str2=str.concat("to Deloitte");
		
	
		String happiness="Happiness is a choice not a state";
		String wordSplit[]=happiness.split(" ");
		int size=wordSplit.length;
		for(int index=0;index<size;index++)
		{
			System.out.println(wordSplit[index]);
		}
		

	}

}
