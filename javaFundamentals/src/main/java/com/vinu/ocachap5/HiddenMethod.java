package com.vinu.ocachap5;


class Marsupial{
	
	public static boolean isBiped(){
		return false;
	}
	
	public void getMarsupialDescription(){
		System.out.println("Marsupial walks on 2 feet ? "+isBiped());
	}
	
	public void getDescription(){
		System.out.println("Marsupial walks on 2 feet ? "+isBiped());
	}
}

class Kangaroo extends Marsupial{
	
	public static boolean isBiped(){
		return true;
	}
	
	public void getKangarooDescription(){
		System.out.println("Kangaroo hops on 2 feet ? "+isBiped());
	}
	
	public void getDescription(){
		System.out.println("Kangaroo walks on 2 feet ? "+isBiped());
	}
	
}

public class HiddenMethod{

	public static void main(String[] args){
		
		Kangaroo joey = new Kangaroo();
		System.out.println("Calls from Kangaroo Object");
		joey.getKangarooDescription();
		joey.getMarsupialDescription();		//since method isBiped is hidden and call is from parent class , static method of parent class is called.
		
		System.out.println("Explicit call to Marsupial static isBiped()");
		System.out.println(Marsupial.isBiped());
		
		System.out.println("Calls from Marsupial Object");
		Marsupial something = new Marsupial();
		something.getMarsupialDescription();	// this also calls parent isBiped method.
		
		Marsupial m1 = new Kangaroo();
		m1.getDescription();	
	
	}
	
	
}

