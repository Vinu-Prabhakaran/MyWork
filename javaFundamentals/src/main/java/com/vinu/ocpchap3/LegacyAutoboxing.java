/**
 * 
 */
package com.vinu.ocpchap3;

import java.util.*;

/**
 * @author Vinu Prabhakaran
 *         on Nov 6, 2021
 *
 */
public class LegacyAutoboxing {
	
	public static void main(String[] args) {
		List numbers=new ArrayList();
		numbers.add(5);
		int num=(int) numbers.get(0);// Object has to be implicitly cast
	}
}
