package com.vinu.ocachap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		String[] nameArr= {"Vinu","Ameya","Ramya","Aditi"};
		List<String> nameList = Arrays.asList(nameArr);
		
		System.out.println("nameList "+nameList);
		Collections.sort(nameList);
		System.out.println("nameArr "+Arrays.toString(nameArr));
		
		nameArr[0]="Aditi Vinu";
		System.out.println("nameList "+nameList);
		
		nameList.add("CP");	// the arrayList is fixed and size cannot be changed.
	}

}
