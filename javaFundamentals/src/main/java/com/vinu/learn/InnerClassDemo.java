package com.vinu.learn;

// Program to test inner class. The members of outer class are accessible to the inner class
//But not vice versa.
class Company
{
	int iTotEmployees = 100;
	
	void dispOuter()
	{
		HRDept hr1= new HRDept();
		System.out.println("The number of eomployees is "+iTotEmployees);
		hr1.displayInner();
	}
	
	class HRDept
	{
		int iTotHREmployees=20;
		
		void displayInner()
		{
			System.out.println("From _Inner:The number of employees is "+iTotEmployees);
			System.out.println("From _Inner:The number of HR employees is "+iTotHREmployees);
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1=new Company();
		c1.dispOuter();
	}

}
