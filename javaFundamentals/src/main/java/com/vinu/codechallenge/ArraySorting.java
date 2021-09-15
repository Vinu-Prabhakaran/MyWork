/**
 * 
 */
package com.vinu.codechallenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;

/**
 * @author Vinu Prabhakaran
 *         on Aug 22, 2021
 *
 */

public class ArraySorting {
	
	private int[] intArr;
	private int arrayLength;
	public void generateRandomArray(int limit) {
		
		List<Integer> intList = Stream.generate(() -> new Random().nextInt(10)).filter(n -> n > 0).limit(limit).collect(Collectors.toList());
		intArr=new int[limit];
		int idx=0;
		for (Iterator<Integer> i = intList.iterator();i.hasNext();) {
			intArr[idx] = i.next();
			idx++;
		}
		arrayLength=intArr.length;
	}
	
	public static void main(String[] args) {
		ArraySorting as=new ArraySorting();
		//as.generateRandomArray(10);
		int[] intArr= {9,8,7,6,5,4,3,2,1};
		//System.out.println(Arrays.toString(as.intArr));
		
		System.out.println("BubbleSort");
		as.bubbleSortArray(intArr);
		int[] intArr2= {9,8,7,6,5,4,3,2,1};
		System.out.println("SelectionSort");
		as.selectionSortArray(intArr2);
		System.out.println("Insertion Sort");
		int[] intArr3= {9,8,7,6,5,4,3,2,1};
		as.insertionSortArray(intArr3);
		//System.out.println("Sorted :"+Arrays.toString(as.intArr));
	}
	//Largest goes to bottom after one iteration O(n)
	private void bubbleSortArray(int[] intArr) {
		
		System.out.println("Original Array :"+Arrays.toString(intArr));
		int arrayLength=intArr.length;
		for(int i=arrayLength-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(intArr[j] > intArr[j+1]) {
					int t=intArr[j+1];
					intArr[j+1]=intArr[j];
					intArr[j]=t;
				}
			}
			System.out.println("After iteration #"+i+" :"+Arrays.toString(intArr));
		}
	}
	
	//Find the minimum element in each run of the array and swap it with the element at the current index is compared. - O(n^2)
	private void selectionSortArray(int[] intArr) {
		
		System.out.println("Original Array :"+Arrays.toString(intArr));
		int arrayLength=intArr.length;
		int min=0;
		for(int i=0;i<arrayLength-1;i++) {
			min=i;
			for(int j=i+1;j<arrayLength;j++) {
				System.out.print("i="+i+";j="+j);
				if(intArr[j] < intArr[min]) {
					min=j;
				}
			}
			int temp=intArr[min];
			intArr[min]=intArr[i];
			intArr[i]=temp;
			System.out.println("After iteration #"+i+" :"+Arrays.toString(intArr));
		}
	}
		
	//Compare each entry to its predecessor and shift to left 
	private static void insertionSortArray(int[] intArr) {
		
		System.out.println("Original Array :"+Arrays.toString(intArr));
		int arrayLength=intArr.length;
		for(int i=1;i<arrayLength;i++) {
			int key=intArr[i];
			int j=i-1;
			while (j>=0 && intArr[j] > key) {
				intArr[j+1]=intArr[j];
				j--;
			}
			intArr[j+1]=key;
			System.out.println("After iteration #"+i+" :"+Arrays.toString(intArr));
		}
	}
	
	/*Merge sort is one of the most flexible sorting algorithms in java known to mankind (yes, no kidding). 
	It uses the divide and conquers strategy for sorting elements in an array. 
	It is also a stable sort, meaning that it will not change the order of the original elements 
	in an array concerning each other.
	The underlying strategy breaks up the array into multiple smaller segments till segments 
	of only two elements (or one element) are obtained. 
	Now, elements in these segments are sorted and the segments are merged to form larger segments. 
	This process continues till the entire array is sorted.

	This algorithm has two main parts:

	mergeSort() – This function calculates the middle index for the subarray and 
	then partitions the subarray into two halves. The first half runs from index left to middle, 
	while the second half runs from index middle+1 to right. After the partitioning is done, 
	this function automatically calls the merge() function for sorting the subarray being handled by the mergeSort() call.
	merge() – This function does the actual heavy lifting for the sorting process. 
	It requires the input of four parameters – the array, the starting index (left), 
	the middle index (middle), and the ending index (right). Once received, merge() will split 
	the subarray into two subarrays – one left subarray and one right subarray. 
	The left subarray runs from index left to middle, while the right subarray runs from index middle+1 to right. 
	This function then merges the two subarrays to get the sorted subarray.*/
	
	private static void mergeSort(int[] intArr,int left,int right) {
		int middle;
		if (left < right) {
			middle=(left+right)/2;
			mergeSort(intArr, left, middle);
			mergeSort(intArr, middle+1, right);
			merge(intArr,left,middle,right);
		}
	}
	
	private static void merge(int[] intArr,int left,int middle,int right) {
		//int middle;
		if (left < right) {
			middle=(left+right)/2;
			mergeSort(intArr, left, middle);
			mergeSort(intArr, middle+1, right);
			merge(intArr,left,middle,right);
		}
	}
}
