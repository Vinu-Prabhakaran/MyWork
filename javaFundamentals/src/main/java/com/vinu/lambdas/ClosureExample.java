package com.vinu.lambdas;

public class ClosureExample {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		doProcess(a,i -> System.out.println(i+b)); 	//variable b will be treated final by the compiler (closed for any further update)
													//any modification to b will be flagged as error
		//b++;
		
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process {
	public void process(int a);
}