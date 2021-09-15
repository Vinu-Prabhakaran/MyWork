/**
 * 
 */
package com.vinu.euler.codechallenge;

import java.util.*;

/**
 * @author Vinu Prabhakaran
 *         on Aug 23, 2021
 *
 */
/*If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 
(one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage.
*/
public class P17NumberLetterCounts {
	public static void main(String[] args) {
		
		int letters=0;
		for (int i=1;i<=1000;i++) {
			System.out.println(numberToWords(i));
			letters=letters+(numberToWords(i).replace(" ", "").length());
		}
		System.out.println("Answer is "+letters);
	}
	
	public static String numberToWords(int num) {
		String number="";
		Map<String,String> onesMap=new HashMap<>();
		Map<String,String> tensMap=new HashMap<>();
		Map<String,String> elevenToNineteenMap=new HashMap<>();
		Map<String,String> hundredsMap=new HashMap<>();
		onesMap.put("0", "");
		onesMap.put("1", " one");
		onesMap.put("2", " two");
		onesMap.put("3", " three");
		onesMap.put("4", " four");
		onesMap.put("5", " five");
		onesMap.put("6", " six");
		onesMap.put("7", " seven");
		onesMap.put("8", " eight");
		onesMap.put("9", " nine");
		elevenToNineteenMap.put("11", " eleven");
		elevenToNineteenMap.put("12", " twelve");
		elevenToNineteenMap.put("13", " thirteen");
		elevenToNineteenMap.put("14", " fourteen");
		elevenToNineteenMap.put("15", " fifteen");
		elevenToNineteenMap.put("16", " sixteen");
		elevenToNineteenMap.put("17", " seventeen");
		elevenToNineteenMap.put("18", " eighteen");
		elevenToNineteenMap.put("19", " nineteen");
		
		tensMap.put("0", "");
		tensMap.put("1", " ten");
		tensMap.put("2", " twenty");
		tensMap.put("3", " thirty");
		tensMap.put("4", " forty");
		tensMap.put("5", " fifty");
		tensMap.put("6", " sixty");
		tensMap.put("7", " seventy");
		tensMap.put("8", " eighty");
		tensMap.put("9", " ninety");
		hundredsMap.put("0", "");
		hundredsMap.put("1", "one hundred");
		hundredsMap.put("2", "two hundred");
		hundredsMap.put("3", "three hundred");
		hundredsMap.put("4", "four hundred");
		hundredsMap.put("5", "five hundred");
		hundredsMap.put("6", "six hundred");
		hundredsMap.put("7", "seven hundred");
		hundredsMap.put("8", "eight hundred");
		hundredsMap.put("9", "nine hundred");
		String strNum = String.valueOf(num);
		String twoDigit=null;
		
		switch(strNum.length()) {
			case 1:
				number=onesMap.get(strNum);
				break;
			case 2:
				if ((twoDigit = elevenToNineteenMap.get(strNum)) != null) {
					number=twoDigit;
				} else {
					number=tensMap.get(strNum.substring(0,1))+onesMap.get(strNum.substring(1,2));
				}
				break;
			case 3:
				number+=hundredsMap.get(strNum.substring(0,1));
				String lastTwoDigit=strNum.substring(1);
				if (lastTwoDigit.equals("00")) {
					
				}
				else if ((twoDigit = elevenToNineteenMap.get(lastTwoDigit)) != null) {
					number= number+" and "+twoDigit;
				} else {
					number=number+" and "+tensMap.get(lastTwoDigit.substring(0,1))+onesMap.get(lastTwoDigit.substring(1,2));
				}
				break;
			case 4:
				number="one Thousand";
				break;
			default:
				return "Support only till 3 digit numbers";
				
		}
		
		return number;
	}
}
