package com.vinu.ocpchap1;

public class TestHashCode {
	
	Integer num1;
	
	public TestHashCode(int i) {
		num1 = i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num1 == null) ? 0 : num1.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestHashCode other = (TestHashCode) obj;
		if (num1 == null) {
			if (other.num1 != null)
				return false;
		} else if (!num1.equals(other.num1))
			return false;
		return true;
	}
	public static void main(String[] args) {
		
		TestHashCode th1 = new TestHashCode(10);
		TestHashCode th2 = new TestHashCode(12);
		TestHashCode th3 = new TestHashCode(12);
		
		System.out.println("th1.equals(th2) :"+th1.equals(th2));
		System.out.println("th3.equals(th2) :"+th3.equals(th2));
		
		System.out.println("th1.hashCode() :"+th1.hashCode());
		System.out.println("th2.hashCode() :"+th2.hashCode());
		System.out.println("th3.hashCode() :"+th3.hashCode());
		
		String s1 = "Vinu1";
		Integer i1=10;
		System.out.println(s1.hashCode());
		System.out.println(i1.hashCode());

	}

}
