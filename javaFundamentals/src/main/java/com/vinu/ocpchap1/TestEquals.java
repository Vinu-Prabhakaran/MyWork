package com.vinu.ocpchap1;

public class TestEquals {
	
	private int idNumber;
	private String name;
	private int age;
	
	public TestEquals(int idNumber,String name,int age) {
		this.idNumber = idNumber;
		this.name=name;
		this.age=age;
	}
	
	

	public static void main(String[] args) {
		
		TestEquals te1 = new TestEquals(1234,"Abcd",30);
		TestEquals te2 = new TestEquals(2345,"Bcde",30);
		TestEquals te3 = new TestEquals(1234,"Abcd",30);
		
		System.out.println(te1.equals(te2));
		System.out.println(te1.equals(te3));
		System.out.println(te1.equals(null));
	}



	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof TestEquals)) {
			return false;
		}else {
			TestEquals temp = (TestEquals) obj;
			return this.idNumber == temp.idNumber; 
		}
	}

}
