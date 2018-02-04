package com.vinu.learn;

import java.util.Scanner;

public class ArraySamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empName[] = new String[3];
		Scanner inp = new Scanner(System.in);
		int i;
		for (i=0;i<3;i++)
		{
			System.out.println("Enter name "+(i+1));
			empName[i] = inp.next();
		}
		
		System.out.println("Entered details follow:");
		for(i=0;i<3;i++)
		{
			System.out.println("Name "+(i+1)+" "+empName[i]);
		}
		inp.close();
	}

}
