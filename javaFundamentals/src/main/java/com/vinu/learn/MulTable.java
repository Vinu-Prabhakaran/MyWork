package com.vinu.learn;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		try
		{
		Scanner inp = new Scanner(System.in);
		System.out.println("Which number's table do we need?");
		int iNum=inp.nextInt();
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+" X "+iNum+" = "+(i*iNum));
		}
		inp.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		
	}

}
