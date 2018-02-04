package com.tcs.myApp.model;

public class Book 
{
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	public int getBookId() {
		return bookId;
	}
	public void setBookID(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public Book(int bookID, String bookName, String bookAuthor, double bookPrice) {
		super();
		this.bookId = bookID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	
	
	
}

