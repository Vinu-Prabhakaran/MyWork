package com.tcs.myApp.tester;

import com.tcs.myApp.model.Car;
import com.tcs.myApp.model.Vehicle;

public class VehicleTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vehicle v1 = new Car("Red",1000);
		
		v1.move();
		//Typecasting
		((Car)v1).m1();
		((Car)v1).m1(10);
		((Car)v1).m1("Vinu");
		
		((Car)v1).display();

	}

}
