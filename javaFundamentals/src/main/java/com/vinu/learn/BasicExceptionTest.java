package com.vinu.learn;

import java.util.Scanner;

public class BasicExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,num=10,res;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number");
		i=inp.nextInt();
		
		try { // Try block starts.Code which can potentially raise an exception
			res=num/i;
			System.out.println("Result of divding 10 by "+i+" is "+res);
		}catch(ArithmeticException e) // Logic to be performed upon exception
		{
			System.out.println("Division by Zero!!");
			e.printStackTrace();
		}
		finally { // Finally perform the following irrespective of exception.
			inp.close();
			System.out.println("Exiting the program...");
		}
	}

}
