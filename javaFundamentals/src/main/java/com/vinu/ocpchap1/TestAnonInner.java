package com.vinu.ocpchap1;

interface Message{
	String greet();
}

public class TestAnonInner {
	
	public void dispMessage(Message m) {
		
		System.out.println(m.greet()+", Here we have an anonymous inner class as an argument...");
	}
	
	
	public static void main(String[] args) {
		new TestAnonInner().dispMessage(new Message() {
			public String greet() {
				
				return("Hello Vinu");
			}
		});
		
		//Now lets do it using lambda
		new TestAnonInner().dispMessage(() -> "Hello Vinu Lambda");
	}
	
}
