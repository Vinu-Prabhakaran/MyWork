package com.vinu.ocachap6;

class NoMoreCarrotsException extends Exception {
	public String toString() {
		return "No more carrots!";
	}
	
}

public class ExceptionCases {
	public static void main(String[] args)  throws Exception{
		eatCarrot();// DOES NOT COMPILE without throws or try block
	}
	private static void eatCarrot() throws NoMoreCarrotsException {
		throw new NoMoreCarrotsException();
	}
}