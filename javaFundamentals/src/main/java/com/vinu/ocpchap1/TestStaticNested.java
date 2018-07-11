package com.vinu.ocpchap1;

public class TestStaticNested {
	
	static class StaticNested{
		public void dispMessage() {
			System.out.println("This is a demo of static nested class");
		}
	}
	public static void main(String[] args) {
		
		StaticNested sn = new StaticNested();
		// or TestStaticNested.StaticNested sn = new TestStaticNested.StaticNested();
		sn.dispMessage();

	}

}
