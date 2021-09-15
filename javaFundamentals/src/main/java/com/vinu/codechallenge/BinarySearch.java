/**
 * 
 */
package com.vinu.codechallenge;

import java.util.Arrays;


/**
 * @author Vinu Prabhakaran
 *         on Sep 14, 2021
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		
		int[] intArr= {2,4,6,8,10,12,14,16};
		System.out.println(Arrays.toString(intArr));
		binarySearch(3,intArr,0,intArr.length-1);
		
		
	}
	
	public static void binarySearch(int num, int[] arr,int lowIdx,int highIdx) {
		
		if (lowIdx < highIdx ) {
			int midIdx=(lowIdx+highIdx)/2;
			if(arr[midIdx] == num) {
				System.out.println(num+" found at idx "+midIdx);
				return;
			}
			if (arr[midIdx] < num) {
				binarySearch(num, arr, midIdx, highIdx);
			}else {
				binarySearch(num, arr, lowIdx, midIdx-1);
			}
		} else {
			System.out.println(num +" not found");
		}
	}
}
