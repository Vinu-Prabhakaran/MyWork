package com.vinu.ocachap3;

import java.util.ArrayList;
import java.util.List;

//Sample program to test Continue 
public class Chap3Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		//list.add(7);	//wont compile
		for(String s : list) System.out.print(s);
		
		//Q#13
		//StringBuilder b = "rumble";	//needs new keyword. wont compile
		//b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		//System.out.println(b);
	}
}