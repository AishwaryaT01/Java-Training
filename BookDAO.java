package com.deloitte.library.dao;
//persistence layer
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.deloitte.library.helper.ConnectToDB;
import com.deloitte.library.pojo.Book;
public class BookDAO {
	//JDBC API classes for dat retrival
	private Connection connection =null;
	private PreparedStatement statement=null;
	private ResultSet resultSet=null;
	
	Book book=new Book();
	ArrayList<Book> bookList=new ArrayList<Book>();
	String bookQry="select * from books";
	
	public ArrayList<Book>getBooks()
		throws ClassNotFoundException,SQLException{
		try{
			//open the connection
			connection=ConnectToDB.createConnection();
			//create statement
			statement=connection.prepareStatement(bookQry);
			//get result
			resultSet=statement.executeQuery();
			//Book book;
			while(resultSet.next()){
				//create the pojo
				book=new Book();
				// set the pojo with retrieved values from the row
				book.setBookId(resultSet.getInt(1));
				book.setBname(resultSet.getString(2));
				book.setAuthor(resultSet.getString(3));
				book.setPrice(resultSet.getFloat(4));
				//book object is filled with data
				//add the book to booklist
				bookList.add(book);
				book=null;
			}//end while loop
			
		}catch(SQLException sqlex){
			
		}finally{
			//close connection
			//now data is in array list object no need to keep the 
			ConnectToDB.closeConnection();
		}
		return bookList;
	}
public void showBookList(ArrayList<Book> bookList){
	for(Book book:bookList){
		System.out.println(book.getBookId());
		System.out.println(book.getBname());
	}
}
}
