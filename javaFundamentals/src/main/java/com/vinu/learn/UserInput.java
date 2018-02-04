package com.vinu.learn;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is to accept & display User input");
		System.out.println("**************************************");
		Scanner inp = new Scanner(System.in);
		System.out.println("Please Enter your name");
		String userName = inp.next();
		System.out.println("Hello "+userName);
		inp.close();
		}

}
