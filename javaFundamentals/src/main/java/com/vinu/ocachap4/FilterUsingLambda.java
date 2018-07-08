package com.vinu.ocachap4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FilterUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Arun");
		nameList.add("Varun");
		nameList.add("Tharun");
		nameList.add("Minu");
		nameList.add("Vinu");
		nameList.add("Vinay");
		//Arrays.asList("Arun","Varun","Tharun","Minu","Vinu","Vinay");
		System.out.println("Names starting with \"Vin\"");
		filterNames(nameList, n -> n.startsWith("Vin"));
		
		System.out.println("Names containing \"inu\"");
		filterNames(nameList, n-> n.contains("inu"));
		
		System.out.println("Full List");
		//nameList.forEach(System.out::println);
		System.out.println(nameList);
		
		System.out.println("Removing the ones ending in \"un\"");
		nameList.removeIf(n -> n.endsWith("un"));
		
		System.out.println(nameList);
		
		
	}
	
	public static void filterNames(List<String> names,Predicate<String> p) {
		
		for (String name:names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
		
	}
}
