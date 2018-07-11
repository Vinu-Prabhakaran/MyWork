package com.vinu.learn;

import java.util.Scanner;

public class Student {
	
	private String sName;
	private float fMarks;
	
	
	public Student(String sName,float fMarks) {
		super();
		this.sName = sName;
		this.fMarks= fMarks;
	}

	public void checkStat()
	{
		if (fMarks >= 175 )
		{
			System.out.println("Congrats! "+sName+" is eligible.");
		}
		else
		{
			System.out.println(sName+" is not eligible. Sorry!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inpName;
		float inpMarks;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter name of Student ");
		inpName=inp.next();
		System.out.println("Enter marks of Student ");
		inpMarks=inp.nextFloat();
		Student s1= new Student(inpName,inpMarks);
		s1.checkStat();
		System.out.println("Thanks. Exiting the program.");
		inp.close();
	}
}
