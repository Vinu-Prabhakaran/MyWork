package com.vinu.learn;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum=0;
		System.out.println("Enter a number < 100");
		Scanner inp = new Scanner(System.in);
		iNum=inp.nextInt();
		while(iNum > 100)
		{
			System.out.println("Won't leave until you do so");
			iNum=inp.nextInt();
		}
		System.out.println("Thanks");
		inp.close();
	}

}
