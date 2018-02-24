package com.vinu.ocachap4;

import static java.util.Arrays.asList;	// static import of the asList method.
import java.util.List;

public class StaticImports {

	public static void main(String[] args) {
		
		List<String> newList = asList("Vinu","Ramya");	//Arrays.asList will not works as Arrays class is not imported here
		System.out.println(newList);

	}

}
