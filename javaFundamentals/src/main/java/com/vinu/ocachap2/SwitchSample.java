package com.vinu.ocachap2;

//Sample program to test Continue 
public class SwitchSample {
	public static void main(String[] args) {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
		for (char x = 'a'; x <= 'c'; x++) {
		if (a == 2 || x == 'b')
			//continue FIRST_CHAR_LOOP;
			//continue;
			System.out.print(" " + a + x);
			}
		}
	}
}