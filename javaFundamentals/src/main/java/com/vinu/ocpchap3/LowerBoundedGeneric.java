package com.vinu.ocpchap3;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedGeneric {
	
	public static void addToList(List<? super String> list) {

		list.add("Vinu");
	}
	
	public static void print(List<?> list) {	//or print(List<? super String> list)

		System.out.println(list);
	}
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		addToList(list1);
		List<Object> list2 = new ArrayList<>();
		addToList(list2);		// can pass String or superclass of String
		
		print(list1);
		print(list2);

	}

}