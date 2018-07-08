package com.vinu.learn;


class Book
{
	int price;
	int pages;
	String author;
	String title;
	
	public void setBook(int prc,int pgs, String auth, String titl)
	{
		price=prc;
		pages=pgs;
		author=auth;
		title=titl;
	}
	
	public void dispBookDetails ()
	{
		System.out.println("Book Title  :"+title);
		System.out.println("Book Author :"+author);
		System.out.println("Book Price  :"+price);
		System.out.println("Book Pages  :"+pages);
	}
	
	public void show()
	{
		System.out.println("Details from show method of Book class");
	}
} 

class SoftwareBook extends Book
{
	String softwareVersion;
	String softwareName;
	
	public void setSWBook(String swname, String swver)
	{
		softwareVersion=swver;
		softwareName=swname;
	}
	
	public void dispSWBookDetails()
	{
		dispBookDetails();
		System.out.println("*** Software Book Info***");
		System.out.println("Software Name    :"+softwareName);
		System.out.println("Software Version :"+softwareVersion+"\n\n");
	}
	public void show()
	{
		System.out.println("Details from show method of SofwareBook class");
	}
}

class HardwareBook extends Book
{
	String hardwareTitle;
	
	public void setHWBook(String hwtitle)
	{
		hardwareTitle=hwtitle;
	}
	
	public void dispHWBookDetails()
	{
		System.out.println("*** Hardware Book Info***");
		System.out.println("Hardware Title    :"+hardwareTitle+"\n\n");
	}
	public void show()
	{
		System.out.println("Details from show method of HardwareBook class");
	}
}

public class TestSingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareBook sb = new SoftwareBook();
		sb.setBook(120, 555, "Yashwanth Kanitkar", "Letus C");
		sb.setSWBook("C Programming", "V1");
		sb.dispSWBookDetails();
		HardwareBook hb=new HardwareBook();
		hb.setBook(52, 750, "D G Hannan", "World of Photography");
		hb.setHWBook("Camera");
		hb.dispBookDetails();
		hb.dispHWBookDetails();

	}

}
