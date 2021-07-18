/**
 * 
 */
package com.vinu.ocpchap5;

import java.util.*;



/**
 * @author Vinu Prabhakaran
 *         on Jul 18, 2021
 *
 */
public class ResourceBundleTest {
	public static void main(String[] args) {
		
		Locale us = new Locale("en","US");
		Locale france = new Locale("fr","FR");
		Locale india = new Locale("hi","IN");
		printProperties(us);
		printProperties(france);
		
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", france);
		System.out.println("List of Keys:"+rb.keySet());
		System.out.println("Keys and Values");
		rb.keySet().stream().map(k -> k+":"+rb.getString(k)).forEach(System.out::println);
		
		System.out.println("******ResourceBundle to Property********");
		Properties prop=new Properties();
		rb.keySet().forEach(k -> prop.put(k, rb.getString(k)));
		
		System.out.println(prop.getProperty("hello"));
		System.out.println(prop.getProperty("newkey"));
		System.out.println(prop.getProperty("newkey", "DefaultValueIfKeyNotFound"));
		System.out.println("Read resources for Locale hi_IN from JavaResourceBundle");
		
		ResourceBundle rbIndia = ResourceBundle.getBundle("com.vinu.ocpchap5.Zoo", india);
		System.out.println(rbIndia.getString("hello"));
		System.out.println(rbIndia.getString("open"));

	}


	private static void printProperties(Locale locale) {

		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		System.out.println("Properties for "+locale);
		System.out.println(rb.getObject("hello"));
		System.out.println(rb.getString("open"));
		
		
	}
}
