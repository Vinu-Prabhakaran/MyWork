package com.vinu.ocachap5;


class Mammals{
	
	public boolean isBiped(){
		return false;
	}
	
	public void getMammalsDescription(){
		System.out.println("Mammals walks on 2 feet ? "+isBiped());
	}
	
}

class Ape extends Mammals{
	
	public boolean isBiped(){
		return true;
	}
	
	public void getApeDescription(){
		System.out.println("Ape walks on 2 feet ? "+isBiped());	//had it been super.isBiped() it would have called method from Mammals class
	}
	
}

public class MethodOverriding{

	public static void main(String[] args){
		
		Ape jinku = new Ape();
		
		System.out.println("Calls from Ape Object");
		jinku.getApeDescription();	
		jinku.getMammalsDescription();	//calls the biped method of Ape
		
				
		System.out.println("Calls from Mammals Object");
		Mammals something = new Mammals();
		something.getMammalsDescription();	//here parent version of isBiped is called
		
		
	
	}
	
	
}

