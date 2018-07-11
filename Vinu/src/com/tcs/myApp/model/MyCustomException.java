package com.tcs.myApp.model;

public class MyCustomException extends Exception
{
	public MyCustomException()
    {
        System.out.println("Name is less than 10 characters");
    }
}
