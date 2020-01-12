/**
 * 
 */
package com.vinu.codechallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Vinu Prabhakaran
 *         on Jan 12, 2020
 *
 */
public class Ch06RomanToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roman number to convert");
		String roman=sc.next();
		sc.close();
		System.out.println("Integer value is "+romanToInt(roman));

	}
	
	public static Integer romanToInt(String roman) {
		
		Map<String,Integer> romanMap=new HashMap<>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		Integer num=0;
		int i=0,j=0;
		
		for(i=0,j=1;i< roman.length()-1 && j< roman.length();i++,j++) {
			//System.out.println(String.valueOf(roman.charAt(i)));
			//System.out.println(romanMap.get(String.valueOf(roman.charAt(i))));
			if (romanMap.get(String.valueOf(roman.charAt(i))) >= romanMap.get(String.valueOf(roman.charAt(j)))){
				num+=romanMap.get(String.valueOf(roman.charAt(i)));
			} else {
				num-=romanMap.get(String.valueOf(roman.charAt(i)));
			}
		}
		num+=romanMap.get(String.valueOf(roman.charAt(i)));
		return num;
		
	}
}
