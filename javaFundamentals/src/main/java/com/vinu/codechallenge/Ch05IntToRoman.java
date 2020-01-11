/**
 * 
 */
package com.vinu.codechallenge;

import java.util.Scanner;

/**
 * @author Vinu Prabhakaran
 *         on Jan 10, 2020
 *
 */
public class Ch05IntToRoman {

	/**
	 * 50 = L,100=C,500=D,1000=M
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to convert");
		Integer num=sc.nextInt();
		sc.close();
		System.out.println("Roman value is "+intToRoman(num.toString()));
		System.out.println("Roman using simpler "+simplerRoman(num));

	}
	
	public static String intToRoman(String num) {
		
		String[] units= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] tens= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
		String[] hundreds= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};
		char[] cArr=num.toCharArray();
		StringBuilder sb=new StringBuilder("");
		int pos=0;
		for (int i=0;i < cArr.length;i++) {
			pos=cArr.length - i;
			if (pos == 3) {
				sb.append(hundreds[Integer.valueOf(String.valueOf(cArr[i]))]);
			}else if (pos == 2) {
				sb.append(tens[Integer.valueOf(String.valueOf(cArr[i]))]);
			}else if (pos == 1) {
				//System.out.println((int)cArr[i]);
				sb.append(units[Integer.valueOf(String.valueOf(cArr[i]))]);
			}
		}
		return sb.toString();
		
	}
	
	public static String simplerRoman(int num) {
		
		String[] units= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] tens= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
		String[] hundreds= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};
		
		return hundreds[(num /100)]+tens[(num/10) % 10]+units[num % 10];
		
	}

}
