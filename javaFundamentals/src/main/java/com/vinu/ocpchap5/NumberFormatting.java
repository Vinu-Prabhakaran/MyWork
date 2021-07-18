/**
 * 
 */
package com.vinu.ocpchap5;

import java.text.*;
import java.util.Locale;

/**
 * @author Vinu Prabhakaran
 *         on Jul 18, 2021
 *
 */
public class NumberFormatting {
	
	public static void main(String[] args) throws ParseException {
		int countForYear = 3_200_000;
		int countPerMonth = countForYear / 12;
		
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		NumberFormat german = NumberFormat.getInstance(Locale.GERMAN);
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println("US Format :"+us.format(countPerMonth));
		System.out.println("DE Format :"+german.format(countPerMonth));
		System.out.println("CA Format :"+ca.format(countPerMonth));
		
		System.out.println("*** Currency Format ***");
		NumberFormat usCurr = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat germanCurr = NumberFormat.getCurrencyInstance(Locale.GERMAN);
		NumberFormat caCurr = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
		
		double price = 213.45;
		System.out.println("US Format :"+usCurr.format(price));
		System.out.println("DE Format :"+germanCurr.format(price));
		System.out.println("CA Format :"+caCurr.format(price));
		
		System.out.println("*** Parsing Numbers ***");
		String num = "123.45";
		System.out.println(us.parse(num));
		System.out.println(german.parse(num));
		System.out.println("*** Currency Parsing ***");
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		double value = (Double) cf.parse(amt);
		System.out.println(value); // 92807.99
	}
}
