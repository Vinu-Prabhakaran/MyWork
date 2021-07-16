/**
 * 
 */
package com.vinu.ocpchap4;

import java.util.function.BooleanSupplier;

/**
 * @author Vinu Prabhakaran
 *         on Jul 16, 2021
 *
 */
public class FunctionalInterfacesForPrimitives {
	
	public static void main(String[] args) {
		
		System.out.println("BooleanSupplier");
		BooleanSupplier b=() -> Math.random() > 0.5;
		System.out.println(b.getAsBoolean());
	}
}
