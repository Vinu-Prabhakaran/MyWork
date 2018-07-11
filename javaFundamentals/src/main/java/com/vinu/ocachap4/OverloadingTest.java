package com.vinu.ocachap4;

public class OverloadingTest {
	
//	public OverloadingTest(int a) {
//		System.out.println("Constructor taking int argument");
//	}
	public OverloadingTest(double a) {
		System.out.println("Constructor taking double argument");
	}
	public OverloadingTest(Object a) {
		System.out.println("Constructor taking Object argument");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingTest ot1 = new OverloadingTest((short)1);
		OverloadingTest ot2 = new OverloadingTest(1.2);
		new OverloadingTest(1);		// int can be promoted to long , float , double
		new OverloadingTest(1.2f);	//float promoted to double
		new OverloadingTest(2L);	//long promoted to double
		new OverloadingTest("Vinu");
	}
}
