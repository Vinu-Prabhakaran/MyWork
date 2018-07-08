package com.vinu.lambdas;

import java.util.Arrays;

public class TimingTest{
	
	public static void main(String[] args) {
		
		for(int i=3;i<8;i++) {
			
			int size = (int)Math.pow(10, i);
			System.out.printf("Sorting array of size %d ...%n ",size);
			TimingUtility.timeOp(() -> sortArray(size));
		}
		

	}

	private static void sortArray(int size) {
		
		double[] nums = createArray(size);
		Arrays.sort(nums);
	}

	private static double[] createArray(int size) {
		
		double[] nums = new double[size];
		
		for(int i=0;i<size;i++) {
			nums[i]= Math.random();
		}
		return nums;
	}
}

class TimingUtility {
	
	public static final int ONE_BILLION= 1_000_000_000;
	
	public static void timeOp(Op operation) {
		
		long startTime = System.nanoTime();
		operation.runOp();
		long endTime=System.nanoTime();
		//double duration = (endTime - startTime)/ONE_BILLION;
		double duration = (endTime - startTime);
		System.out.printf("Elapsed time : %f nanoseconds %n",duration);
		
	}

}

interface Op{
	void runOp();
}