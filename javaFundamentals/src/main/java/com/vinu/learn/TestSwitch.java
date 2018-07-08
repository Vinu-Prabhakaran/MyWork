package com.vinu.learn;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cValue;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter month number");
		cValue=inp.nextInt();
		
		switch (cValue)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;	
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Not a valid month");
			break;
		}
		
		//Switch does work with Strings...
		System.out.println("Enter input");
		String fruit = inp.next();
		switch(fruit) {
		case "Apple":
			System.out.println(fruit+" is Red");
			break;
		case "Orange":
			System.out.println(fruit+" is Orange in color");
			break;
		default:
			System.out.println("I dont know what "+fruit+" is.");
		}
		inp.close();
	}

}
