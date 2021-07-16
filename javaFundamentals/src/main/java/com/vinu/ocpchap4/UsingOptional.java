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
		
		
		//System.out.println("Enter something");
		//String s=inp.nextLine();
		String s = null;
		Optional<String> o1= Optional.ofNullable(s);
		//System.out.println(o1.orElseThrow(IllegalArgumentException::new));
		System.out.println(o1.orElseGet(() -> "What is this?"));
		System.out.println(o1.orElse("Something Else"));
		String s2 = "Input Value";
		Optional<String> o2= Optional.ofNullable(s2);
		System.out.println(o2.orElseThrow(IllegalArgumentException::new));
		System.out.println(o2.orElseGet(() -> "What is this?"));
		System.out.println(o2.orElse("Something Else"));
		inp.close();
	}

}
