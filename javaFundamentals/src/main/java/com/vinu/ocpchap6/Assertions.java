/**
 * 
 */
package com.vinu.ocpchap6;

/**
 * @author Vinu Prabhakaran
 *         on Jul 19, 2021
 *
 */
public class Assertions {
	//Enable assertions by adding VM arg -ea
	public static void main(String[] args) {
		int numGuests=5;
		assert numGuests > 5 : "Guests less than 6";
		System.out.println("Guest count :"+numGuests);
	}
}
