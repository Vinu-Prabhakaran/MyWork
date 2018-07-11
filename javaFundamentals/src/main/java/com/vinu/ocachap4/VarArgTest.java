package com.vinu.ocachap4;

public class VarArgTest {

	public static void walk(int start,int...nums) {
		System.out.println("Vararg length is "+nums.length);
		//System.out.println(nums[0]);
	}
	public static void main(String[] args) {
		
		int[] n = {1,2,3,4};
		walk(1);	//here no parm is passed for vararg. BUt java creates an empty array
		walk(1,1);
		walk(1,1,2,3);
		walk(1,n);

	}

}
