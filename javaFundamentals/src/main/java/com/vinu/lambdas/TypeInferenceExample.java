package com.vinu.lambdas;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringLengthLambda stringLength = (String s) -> s.length();
		//or stringLengthLambda stringLength = s -> s.length();
		//display(stringLength);  or as below
		display( s -> s.length());
	}
	
	public static void display(stringLengthLambda l) {
		System.out.println(l.strLen("hello count my length"));
	}
	
	interface stringLengthLambda{
		
		public int strLen(String s);
	}
}
