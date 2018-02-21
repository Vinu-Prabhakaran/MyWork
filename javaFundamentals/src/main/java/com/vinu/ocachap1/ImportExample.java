package com.vinu.ocachap1;

import java.util.Random;

public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random(); // DOES NOT COMPILE
		System.out.println(r.nextInt(100));  //prints a number between 0 and 99
	}
}