
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strBldr=new StringBuilder("Welcome");
		System.out.println(strBldr);
		strBldr.append(" to");
		System.out.println(strBldr);
		strBldr.insert(3, "Hello");
		System.out.println(strBldr);
		strBldr.deleteCharAt(4);
		System.out.println(strBldr);

		strBldr.delete(3, 6);
		System.out.println(strBldr);
		strBldr.reverse();
		System.out.println(strBldr);
	}

}
