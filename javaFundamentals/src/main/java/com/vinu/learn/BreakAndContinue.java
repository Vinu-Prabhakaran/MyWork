package com.vinu.learn;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j;
		System.out.println("Testing Break");
		for(i=1;i<11;i++)
		{
			if (i>4 && i < 8)
			{
				System.out.println("From if "+i);
				break; // takes control totally out of the loop
			}
			System.out.println(i);
		}
		System.out.println("Testing Continue");
		for(j=1;j<21;j+=2)
		{
			if (j >4 && j < 8)
			{
				System.out.println("From if "+j);
				continue; //takes control to next iteration of loop;
			}
			System.out.println(j);
		}
	}

}
