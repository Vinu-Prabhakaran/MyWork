package com.vinu.ocachap3;

import java.util.Arrays;

public class ArrayType {
	public static void main(String[] args) {
		String bugs[]= {"cricket","beetle","lady bug"};
		String[] alias = bugs;
		
		System.out.println(alias==bugs);
		
		System.out.println(bugs.toString());
		System.out.println(Arrays.toString(bugs));
		
		Arrays.sort(bugs);	//sorts the array elements
		
		for (String bug : bugs) {
			System.out.println(bug+" ");
		}
		
		String rectangle[][] = null;
		rectangle[0][1]= "set";
				
	}
}
