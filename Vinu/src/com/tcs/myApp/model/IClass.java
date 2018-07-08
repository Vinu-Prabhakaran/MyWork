package com.tcs.myApp.model;

//Class for Interface testing
public class IClass implements Interface1,Interface2 
{
	public void m1()
	{
		System.out.println("Method 1 from Interface1");
		System.out.println("Value of constant is "+ Interface1.TESTNUMBER);
	}
	public void m2()
	{
		System.out.println("Method 2 from Interface2");
	}
	public void m3()
	{
		System.out.println("Method 3 from Interface2");
	}
}
