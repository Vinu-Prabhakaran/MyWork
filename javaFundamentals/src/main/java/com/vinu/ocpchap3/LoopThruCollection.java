package com.vinu.ocpchap3;

import java.util.ArrayList;
import java.util.List;

public class LoopThruCollection {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		list.add("Magician");
		list.add("Technician");
		list.add("Assistant");
		list.removeIf(s -> s.endsWith("ian"));
		System.out.println("After Filter :"+list);
		
		List<Integer> ilist =new ArrayList<>();
		ilist.add(2);
		ilist.add(4);
		ilist.add(6);
		ilist.replaceAll(i -> i*2);
		System.out.println("After replaceAll");
		ilist.forEach(System.out::println);

	}

}
