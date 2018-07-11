package com.vinu.ocachap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList list0 = new ArrayList();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		
		ArrayList<String> list4 = new ArrayList<>();
		
		list1.add("Vinu");
		list1.add("Ameya");
		list1.add("Aditi");
		list1.add("Ramya");
		
		System.out.println(list1.toString());	//ArrayList has an implementation of toString to below also works
		System.out.println(list1);
		System.out.println(Arrays.toString(list1.toArray()));
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.remove(1);	// to remove value at index 1
		System.out.println(numbers);
		numbers.remove(Integer.valueOf(3));	// to remove value 3
		System.out.println(numbers);
		numbers.add(5);
		numbers.add(3);
		
		//sorting
		System.out.println("Before Sort :"+numbers);
		Collections.sort(numbers);
		System.out.println("Sorted :"+numbers);
		
		//converting to array
		
		String[] arr1 = list1.toArray(new String[0]);
		String[] mammals = {"monkey","donkey","gorilla"};
		
		System.out.println("Array Object equality "+mammals.equals(mammals));
		
		System.out.println("List to Array :"+Arrays.toString(arr1));
		//array to List
		
		List<String> mammList = Arrays.asList(mammals);
		Collections.sort(mammList);
		System.out.println("Array to List (sorted):"+mammList);
		
	}

}
