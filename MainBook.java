import java.util.Scanner;
public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Book book[]=new Book[5];
		
		for(int index=0;index<5;index++){
			System.out.println("Enter the book ID,Name,Author and Price");
			int id= input.nextInt();
			String name=input.nextLine();
			String author=input.nextLine();
			float price= input.nextFloat();
			book[index]= new Book(id,name,author,price);
		}
		for (int index=0;index<5;index++){
			System.out.println("The book details are "+book[index].getId()+" "+book[index].getAuthor()+" "+book[index].getName()+" "+book[index].getPrice());
		}
		/*book.setId(1001);
		book.setName("The Goal");
		book.setAuthor("Ellen Kennedy");
		book.setPrice(245.25f);
		
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
		System.out.println(book);
		System.out.println(book.hashCode());*/
	}

}
