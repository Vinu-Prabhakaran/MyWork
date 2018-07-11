package com.vinu.ocachap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticArrayList {
	
	public static final ArrayList<String> stList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stList.add("Vinu");
		stList.add("Ramya");
		System.out.println(stList);	//final arrayList can add entries but the reference variable cannot be reassigned
		stList.set(0, "Ameya");
		System.out.println(stList);
		
		List<String> newList = Arrays.asList("Ammu","Kuttan");
		System.out.println(newList);
		//stList=(ArrayList<String>)newList;  // tryig to reassign final reference variable
		
	}

}
