package com.vinu.learn;

public class GarbageCollDemo {
	
	int mem=3000;
	int[] intArr = new int[mem];
	
	void occupyMemory() {
		for(int i=0;i<mem;i++) {
			intArr[i] = i;
		}
	}
	
	void releaseMemory() {
		for(int i=0;i<mem;i++) {
			intArr[i] = 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollDemo g=new GarbageCollDemo();
		
		Runtime r = Runtime.getRuntime();
		
		//Determine the current amount of free memory
		System.out.println("Total memory "+r.totalMemory());
		r.gc();
		System.out.println("Initial Free memory "+r.freeMemory());
		System.out.println("Allocating memory for Array...");
		g.occupyMemory();
		System.out.println("Free memory after consumption "+r.freeMemory());
		System.out.println("Releasing memory for Array...");
		g.releaseMemory();
		System.out.println("Free memory after release "+r.freeMemory());
		
		System.out.println("Calling garbage collection...");
		r.gc();
		
		System.out.println("Free memory after gc "+r.freeMemory());
	}

}
