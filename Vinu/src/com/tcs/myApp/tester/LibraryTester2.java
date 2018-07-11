package com.tcs.myApp.tester;

import java.util.ArrayList;

import com.tcs.myApp.model.Book;
import com.tcs.myApp.model.Library2;

public class LibraryTester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Book b1 = new Book(1,"Java","Author 1", 25);
        Book b2 = new Book(2,"Oracle","Author 2", 35);
        Book b3 = new Book(3,"CPP","Author 2", 15);
        Book b4 = new Book(4,"COBOL","Author 3", 13);
        
        ArrayList<Book> books = new ArrayList();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        
        
        Library2 obj = new Library2("Cincinnati", books);
            //obj.printAllBookDetails();
            obj.printAllBookDetailsForEach();
        
	}

}
