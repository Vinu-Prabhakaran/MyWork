package com.vinu.ocapractice;

public class NestedLoop {

//for loop check this
	public static void main(String[] args) {
				
		System.out.println("Printing 2D array values");
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for (int[] arr:myComplexArray){
			for (int i=0;i<arr.length;i++){
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
	}
}