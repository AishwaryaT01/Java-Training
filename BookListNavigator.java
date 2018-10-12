import java.util.ArrayList;
public class BookListNavigator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList=new ArrayList<Book>();
		Book book1= new Book(1001,"2 States","Chetan Bhagat",652.32f);
		Book book2= new Book(1002,"Three idiots","Chetan Bhagat",650.40f);
		Book book3= new Book(1003,"Hopeless","Collen Hoover",456.32f);
		Book book4= new Book(1004,"The Deal","Ellen Kennedy",345.32f);
		Book book5= new Book(1005,"The Goal","Ellen Kennedy",895.32f);
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		for(Book book:bookList){
			System.out.println(book.getId()+" "+
								book.getBname()+" "+
								book.getAuthor()+" "+
								book.getPrice());
		}
	

	}

}
