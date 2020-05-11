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
	
	public boolean isEven(int a) {
		
		return (a%2==0?true:false);
	}
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
}
