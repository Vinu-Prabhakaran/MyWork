package com.tcs.myApp.model;

import java.util.ArrayList;

public class Library2 
{
	private String location;
	private ArrayList<Book>books=new ArrayList();
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book>books) {
		this.books = books;
	}
	public Library2(String location, ArrayList<Book> books2) {
		super();
		this.location = location;
		this.books = books2;
	}
	
	public void printAllBookDetails()
	{
		System.out.println("Using Normal for loop...");
		for (int i=0;i<books.size();i++)
		{
			System.out.println("Book ID - "+books.get(i).getBookId());
			System.out.println("Name of Book -"+books.get(i).getBookName());
			System.out.println("Name of Author -"+books.get(i).getBookAuthor());
			System.out.println("Price of Book -"+books.get(i).getBookPrice());
			System.out.println();
			
		}
	}
	
	public void printAllBookDetailsForEach()
	{
		System.out.println("Using FOR EACH loop");
		for(Book b:books)
		{
			System.out.println("Book ID - "+b.getBookId());
			System.out.println("Name of Book - "+b.getBookName());
			System.out.println("Name of Author - "+b.getBookAuthor());
			System.out.println("Price of Book - "+b.getBookPrice());
			System.out.println();
		}
	}
}
