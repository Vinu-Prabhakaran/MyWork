package com.vinu.learn;

class StudentInfo {
	String studID;
	String studName;
	
	public void setStudentInfo(String studID, String studName) {
		this.studID = studID;
		this.studName = studName;
	}

	public void showStudInfo()
	{
		System.out.println("Student ID is "+studID);
		System.out.println("Student Name is "+studName);
	}
}

class MarksInfo extends StudentInfo
{
	float studMark1;
	float studMark2;
	
	public void setMarksInfo(float mark1,float mark2)
	{
		studMark1=mark1;
		studMark2=mark2;
	}
	
	
	public void showMarksInfo()
	{
		System.out.println("Marks for 1st Subject is "+studMark1);
		System.out.println("Marks for 2nd Subject is "+studMark2);
	}
}

class StudentDetails extends MarksInfo implements MedicalInfo
{
	float total;
	public void dispMedInfo()
	{
		System.out.println("***** Medical Info ******");
        System.out.println("Blood Group of "+studName+" is "+bloodGroup);
		System.out.println("Height of "+studName+" is "+height);
	}
	
	public StudentDetails(String id,String name)
	{
		studName=name;
		studID=id;
	}
	
	public void dispAll()
	{
		showStudInfo();
		dispMedInfo();
		showMarksInfo();
		total = studMark1+studMark2;
		System.out.println("Total Marks for "+studName+" is "+total);
	}
}