package com.vinu.learn;

import java.util.ArrayList;

public class ArrayListTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList= new ArrayList<>();
		
		String[] inp = {"Vinu","Ramya","Geetha","Prabhakaran"};
		
		System.out.println("Loading data to ArrayList");
		for (int i=0;i<inp.length;i++) {
			arrList.add(inp[i]);
		}
		
		System.out.println("Current List follows :"+'\n'+arrList);
		
		System.out.println(arrList.get(2));
		
		System.out.println("Adding Ammu");
		arrList.add(2, "Ameya");
		System.out.println("Current List follows :"+'\n'+arrList);
		
		System.out.println("Setting Aathu at 4");
		arrList.set(3, "Aditi");
		System.out.println("Current List follows :"+'\n'+arrList);
		
		arrList.add("Geetha");
		System.out.println("Current List follows :"+'\n'+arrList);
		
		System.out.println("Getting Ammus Index");
		System.out.println(arrList.indexOf("Ameya"));
	}

}
