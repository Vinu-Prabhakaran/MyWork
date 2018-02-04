package com.vinu.learn;

@SuppressWarnings("serial")
class UserException extends Exception{
	
	int num1,num2,sum;
	UserException(int a,int b){
		num1=a;
		num2=b;
		sum=a+b;
	}
	public String toString() {
		return("The sum of "+num1+" and "+num2+" is > 20...");
	}
}
public class UserExceptionDemo {
	static void calculator(int a, int b) throws UserException{
		System.out.println("Calculate("+a+","+b+")");
		if((a+b) > 20 ) {
			throw new UserException(a,b);
			}
		System.out.println("Result is "+(a+b));
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		try {
			calculator(5,13);
			calculator(10,12);
		}catch (UserException e)
		{
			System.out.println("Exception..."+e.toString());
		}
	}
}
