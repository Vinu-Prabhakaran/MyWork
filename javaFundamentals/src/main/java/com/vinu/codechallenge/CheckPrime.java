/**
 * 
 */
package com.vinu.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 8, 2021
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.lang.reflect.*;
import static java.lang.System.*;
class Prime { //Solution not to use java 8

    public void checkPrime (Integer... nums){
        //List<Integer> numList=Stream.of(nums).collect(Collectors.toList());
    	//List<Integer> numList=
    	OUTER_LOOP:for(int c=0;c<nums.length;c++) {
    		if (nums[c] ==1) {
	    		continue;
    		}
        	for (int i=2;i<= nums[c]/2;i++) {
        		if(nums[c]%i == 0) {
        			continue OUTER_LOOP;
        		}
        	}
			System.out.print(nums[c]+" ");
        };
        System.out.println();
    }
}
public class CheckPrime {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

