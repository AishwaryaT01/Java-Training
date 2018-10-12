package com.deloitte.library.presentation;
import java.sql.SQLException;
import java.util.ArrayList;
import com.deloitte.library.dao.BookDAO;
import com.deloitte.library.pojo.Book;
public class BookUi {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		ArrayList<Book> bookList=new ArrayList<Book>();
		BookDAO bookDao=new BookDAO();
		try{
			bookList=bookDao.getBooks();
		}catch(ClassNotFoundException|SQLException excp){
			excp.printStackTrace();
		}
		bookDao.showBookList(bookList);
	}

}