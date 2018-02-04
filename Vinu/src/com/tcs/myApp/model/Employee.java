package com.tcs.myApp.model;

public class Employee 
{
	
	private int empID;
	private String empName;
	private double experience;
	private String designation;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	//Constructor
	public Employee(int empID, String empName, double experience) 
	{
		super();
		this.empID = empID;
		this.empName = empName;
		this.experience = experience;
	}
	
	

}
