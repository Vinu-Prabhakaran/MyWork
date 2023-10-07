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
		list.add(Integer.valueOf(123));
		list.add(234);			// this is autoboxed
		
		print(list);
		
		List<Float> floatList = new ArrayList<>();
		floatList.add(Float.valueOf(123.34f));
		floatList.add(234.0f);			// this is autoboxed
		
		print(list);

	}

}
