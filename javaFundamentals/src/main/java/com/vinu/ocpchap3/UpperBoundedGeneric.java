package com.vinu.ocpchap3;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedGeneric {
	
	public static void print(List<? extends Number> list) {
		for (Number o:list) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(123));
		list.add(234);			// this is autoboxed
		
		print(list);

	}

}
