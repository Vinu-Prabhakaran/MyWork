package com.vinu.ocpchap4;

import java.util.Optional;
import java.util.Scanner;

public class UsingOptional {
	
	public static Optional<Double> getAverage(int... nums){
			
		if(nums.length == 0) {
			return Optional.empty();
		}else {
			int sum=0;
			for(int num : nums) {
				sum+=num;
			}
			return Optional.of((double) sum/nums.length);
		}
	}
	public static void main(String[] args) {
		
		System.out.println(getAverage(10,20));
		System.out.println(getAverage());
		
		System.out.println("Enter 2 numbers ");
		Scanner inp = new Scanner(System.in);
		int n1 = inp.nextInt();
		int n2 = inp.nextInt();
		Optional<Double> opt = getAverage(n1,n2);
		
		if(opt.isPresent()) {
			System.out.println("Average is "+opt.get());
		}
		
		inp.close();
	}

}
