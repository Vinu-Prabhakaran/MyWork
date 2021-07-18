/**
 * 
 */
package com.vinu.ocpchap5;

import java.util.Locale;

/**
 * @author Vinu Prabhakaran
 *         on Jul 18, 2021
 *
 */
public class LocaleTest {
	
	public static void main(String[] args) {
		 
		Locale locale= Locale.getDefault();
		System.out.println(locale);
		//Locale Constants
		System.out.println(Locale.GERMAN); // de
		System.out.println(Locale.GERMANY); // de_DE
		//Creating Locale using constructor
		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hi","IN"));
		System.out.println("Create Locale using Builder");
		System.out.println(new Locale.Builder()
									.setLanguage("en")
									.setRegion("US")
									.build());
		System.out.println("Setting new default Locale");
		Locale.setDefault(new Locale("hi","IN"));
		System.out.println(Locale.getDefault());
	}
}
