package com.tcs.myApp.tester;

import com.tcs.myApp.model.Book;
import com.tcs.myApp.model.Library;

public class LibraryTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Book b1 = new Book(1,"Java","Author 1", 25);
        Book b2 = new Book(2,"Oracle","Author 2", 35);
        Book b3 = new Book(3,"CPP","Author 2", 15);
        
        Book books[] = {b1, b2, b3};
        
        Library obj = new Library("Cincinnati", books);
            obj.printAllBookDetails();
        
	}

}
