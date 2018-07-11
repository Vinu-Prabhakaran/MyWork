package com.vinu.learn;

class RefObj
	{
		String sName;
	}
class Test
	{
	void Calling()
		{
			RefObj ro1= new RefObj();
			ro1.sName = "Original";
			System.out.println("Name before Called method is "+ro1.sName);
			Called(ro1);
			System.out.println("Name after Called method is "+ro1.sName);
		}
	
	void Called(RefObj ro)
		{
			ro.sName="Modified";
		}
	}


public class TestPassByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.Calling();
		
		String s1 = "Vinu";
		modifyString(s1);	//String used pass by value
		System.out.println("String after modifyString call :"+s1);
		
		
		s1 = changeString(s1);
		System.out.println("String after changeString call :"+s1);
		
	}
	
	static void modifyString(String s) {
		s=s.concat("CP");
		System.out.println("String in modifyString : "+s);
	}
	static String changeString(String s) {
		s=s.concat("CP");
		return s;
	}
}
