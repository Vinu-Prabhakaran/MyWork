/**
 * 
 */
package com.vinu.codechallenge.datastructures;

import java.util.Arrays;

/**
 * @author Vinu Prabhakaran
 *         on Sep 19, 2021
 *
 */
public class MergeSort {
	public void mergeSort(int[] arr,int start, int end) {
		if (start < end) {
			int mid=(start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	public void merge(int[] arr,int start,int mid,int end) {
		int leftSize=mid-start+1;
		int rightSize=end-mid;
		int[] left=new int[leftSize];
		int right[]=new int[rightSize];
		
		for (int i=0;i<leftSize;i++) {
			left[i]=arr[start+i];
		}
		for(int j=0;j<rightSize;j++) {
			right[j]=arr[mid+1+j];
		}
		
		int i=0,j=0;
		for (int k=start;k<=end;k++) {
			if (j >= rightSize || (i < leftSize && (left[i] <= right[j]))) {
				arr[k]=left[i];
				i++;
			}else if (i >= leftSize ||(j < rightSize && (right[j] < left[i]))){
			//}else {
				arr[k]=right[j];
				j++;
			}
		}
	}
	
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}
	
	public static void main(String[] args) {
		
		int[] arr= {3,6,2,7,4,1,5};
		System.out.println("Initial:"+Arrays.toString(arr));
		new MergeSort().sort(arr);
		System.out.println("Final:"+Arrays.toString(arr));
	}
}
