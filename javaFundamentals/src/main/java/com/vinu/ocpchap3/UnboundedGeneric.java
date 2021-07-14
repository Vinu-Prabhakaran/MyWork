package com.vinu.ocpchap3;

import java.util.ArrayList;
import java.util.List;

public class UnboundedGeneric {
	
	public static void print(List<?> list) {
		for (Object o:list) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Vinu");
		list.add("Ramya");
		
		print(list);
		
		List<Integer> intList=new ArrayList<>();
		intList.add(1);
		intList.add(5);
		print(intList);

	}

}
