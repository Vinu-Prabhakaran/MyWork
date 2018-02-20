package com.vinu.ocapractice;

public class Practice1 {

	public static void main(String...args) {  	// ... is called varargs
												// can be String[] args or String args[] or String[] anything
												//
		
		float value1 = 102;
		float value2 = (int)102.0;
		//float value3 = 1f * 0.0;
		float value4 = 1f * (short)0.0;
		//float value5 = 1f * (boolean)0;
		System.out.println(value1+value2+value4);
		
		int x=0;
		while(++x < 5){x+=1;}
		String message= x > 5 ? "Greater than" :"Less than";
		System.out.println(message+","+x);
		
		System.out.println("Max long:"+ Long.MAX_VALUE);
		long l = (long)9223372036854775810.00;
		System.out.println("l ="+l);
	
		String s1;
		String s2=s1="Vinu";
		System.out.println("s1.equals(s2) ? "+s1.equals(s2));
		System.out.println("s1 == s2 ? "+ (s1==s2));
		
		int dayOfWeek;
		dayOfWeek= 5;
		switch(dayOfWeek) {
		case 0:
		System.out.println("Sunday");
		default:
		System.out.println("Weekday");
		case 6:
		System.out.println("Saturday");
		break;
		}
		
		String val = "Vinu";
		alterString(val);
		System.out.println("After alter val ="+val);
		
		int x1 = 50, x2 = 75;
		boolean b = x1 >= x2;
		if(b = true) System.out.println("Success");
		else System.out.println("Failure");
				
		
}
	
	public static void alterString(String s) {
		
		s="Altered";
	}

}