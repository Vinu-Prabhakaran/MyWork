package com.vinu.learn;
// Vinu
public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1=0,iNum2=0,iRes=1;
		System.out.println("Fibonacci Series <100");
		while(iRes < 400)
		{
			System.out.println(iRes);
			iNum1=iNum2;
			iNum2=iRes;
			iRes=iNum1+iNum2;
		}
	}

}
