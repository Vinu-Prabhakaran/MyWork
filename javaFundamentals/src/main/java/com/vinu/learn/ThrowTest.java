package com.vinu.learn;

public class ThrowTest {
	
	void throwMethod()  throws ClassNotFoundException {
		System.out.println("throwMethod throwing Class not found...");
		throw new ClassNotFoundException();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowTest t = new ThrowTest();
			t.throwMethod();
		}catch (ClassNotFoundException cnof)
		{
			System.out.println("And it is caught in main...");
		}
	}

}
