package com.tcs.myApp.tester;

import com.tcs.myApp.model.Employee;

public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee E1 = new Employee(339454,"Vinu",8);
		System.out.println("Details of Employee");
		System.out.println("ID : " + E1.getEmpID());
		System.out.println("Name : " + E1.getEmpName());
	}

}
