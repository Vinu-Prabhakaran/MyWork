package com.tcs.myApp.model;

public class Library 
{
	private String location;
	private Book books[];
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public Library(String location, Book[] books) {
		super();
		this.location = location;
		this.books = books;
	}
	
	public void printAllBookDetails()
	{
		for (int i=0;i<books.length;i++)
		{
			System.out.println("Book ID - "+books[i].getBookId());
			System.out.println("Name of Book -"+books[i].getBookName());
			System.out.println("Name of Author -"+books[i].getBookAuthor());
			System.out.println("Price of Book -"+books[i].getBookPrice());
			System.out.println();
			
		}
	}
	
	public void printDuplicateAuthorNames()
	{
		
	}
}
