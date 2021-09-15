/**
 * 
 */
package com.vinu.codechallenge;

/**
 * @author Vinu Prabhakaran
 *         on Aug 14, 2021
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Sample Input
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
Sample Output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
*/
public class XmlRegex{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
        int count=0;
         Pattern r = Pattern.compile("<(.+?)>([^<]+)</\\1>");
         /*
         <(.+)> matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.

         ([^<]+) matches all the text in between the HTML start and end tags. We place a special restriction on
         		the text in that it can't have the "<" symbol. The characters inside the parenthesis are saved into Group #2.

         </\\1> is to match the HTML end brace that corresponds to our previous start brace. 
         		The \1 is here to match all text from Group #1.
         */		
         Matcher m = r.matcher(line);
         while(m.find()) {
             if (m.group(2).length() !=0) {
                 System.out.println(m.group(2));
             count++;
             }
         }
         if (count == 0) System.out.println("None");
			
			testCases--;
		}
	}
}




