/**
 * 
 */

/**
 * @author Vinu Prabhakaran
 *         on May 5, 2020
 *
 */
package com.vinu.junit5.basics;
public class MathUtils {
	
	public int add(int a, int b) {
		
		return a+b;
	}
	
	public double divide(int a, int b) {
		
		return a/b;
	}
	
	public double multiply(int a, int b) {
		
		return a*b;
	}
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
}
