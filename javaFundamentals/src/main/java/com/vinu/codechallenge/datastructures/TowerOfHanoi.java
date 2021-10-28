/**
 * 
 */
package com.vinu.codechallenge.datastructures;

/**
 * @author Vinu Prabhakaran
 *         on Sep 19, 2021
 *
 */
public class TowerOfHanoi {
	
	public static void main(String[] args) {
		move(3,'A','C','B');
	}

	/**
	 * @param n - Number of discs
	 * @param from - From tower
	 * @param to - To tower
	 * @param inter - Intermediate tower
	 */
	private static void move(int n, char from, char to, char inter) {
		if (n == 1) {
			System.out.println("Move Disc "+(n)+" from "+from+" to "+to);
			return;
		}
		move(n-1,from,inter,to);
		System.out.println("Move Disc "+(n)+" from "+from+" to "+to);
		move(n-1,inter,to,from);
		
	}
}
