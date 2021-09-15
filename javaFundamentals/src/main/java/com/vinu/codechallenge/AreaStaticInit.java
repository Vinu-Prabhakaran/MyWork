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

public class AreaStaticInit {

        private static boolean flag;
        private static int B;
        private static int H;
        static{
            try{
            Scanner sc=new Scanner(System.in);
            B=sc.nextInt();
            H=sc.nextInt();
            if(B <= 0 || H <= 0){
                throw (new Exception("Breadth and height must be positive"));
            } else{
                flag=true;
            }
            } catch (Exception e){
                System.out.println(e);
            }
        }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class