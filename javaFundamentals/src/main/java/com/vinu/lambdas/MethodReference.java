package com.vinu.lambdas;

public class MethodReference {
	public static void main(String[] args) {

		int a=10;
		
		doProcess(a,System.out::println);	// === i -> System.out.println(i) instance::method
											// () -> method() or (p) -> method(p)
											//  The above 2 patterns can be replaced with method reference

	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}