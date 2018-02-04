/**
 * 
 */
package com.vinu.learn;

/**
 * @author Vinu
 *Sample calculator program with predefined variables.Two constructors are coded with different signatures
 */
public class Calculator {
	/**
	 * 
	 */
	private int iVar1;
	private int iVar2;
	
	public int getiVar1() {
		return iVar1;
	}

	public Calculator() {
		// TODO Auto-generated constructor stub
		this.iVar1=12;
		this.iVar2=5;
	}
	
	public Calculator(int iVar1, int iVar2) {
		super();
		this.iVar1 = iVar1;
		this.iVar2 = iVar2;
	}

	public void setiVar1(int iVar1) {
		this.iVar1 = iVar1;
	}

	public int getiVar2() {
		return iVar2;
	}

	public void setiVar2(int iVar2) {
		this.iVar2 = iVar2;
	}

	public int addVars()
	{
		return(iVar1+iVar2);
	}
	
	public int subVars()
	{
		return(iVar1-iVar2);
	}
	
	public int mulVars()
	{
		return(iVar1*iVar2);
	}
	
	public float divVars()
	{
		return(iVar1/iVar2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator(5,6);
		System.out.println("Results from Object c1");
		System.out.println("Value of 1st variable is "+c1.getiVar1());
		System.out.println("Value of 2nd variable is "+c1.getiVar2());
		System.out.println("Addition Result "+c1.addVars());
		System.out.println("Subtraction Result "+c1.subVars());
		System.out.println("Multiplication Result "+c1.mulVars());
		System.out.println("Division Result "+c1.divVars());
		System.out.println("Results from Object c2");
		System.out.println("Value of 1st variable is "+c2.getiVar1());
		System.out.println("Value of 2nd variable is "+c2.getiVar2());
		System.out.println("Addition Result "+c2.addVars());
		System.out.println("Subtraction Result "+c2.subVars());
		System.out.println("Multiplication Result "+c2.mulVars());
		System.out.println("Division Result "+c2.divVars());
	}

}
