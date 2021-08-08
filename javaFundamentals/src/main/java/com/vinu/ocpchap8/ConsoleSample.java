/**
 * 
 */
package com.vinu.ocpchap8;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Vinu Prabhakaran
 *         on Aug 7, 2021
 *
 */
/* Test this on terminal instead of Eclipse
* D:\WorkBench\MyEclipseworkSpace\MyWork\javaFundamentals\src\main\java>javac com\vinu\ocpchap8\ConsoleSample.java
* D:\WorkBench\MyEclipseworkSpace\MyWork\javaFundamentals\src\main\java>java com.vinu.ocpchap8.ConsoleSample
*/
public class ConsoleSample {
	
	public static void main(String[] args) {
		
		Console console=System.console();
		Scanner sc = new Scanner(System.in);
		if (console == null) {
			throw new RuntimeException("Console not available");
		} else {
			String userInput = console.readLine("Please enter something\n");
			console.writer().println("You entered :"+userInput);
			char[] password = console.readPassword("Enter password\n");
			console.writer().println("Verify password");
			console.flush(); // To remove any remnants
			char[] verify = console.readPassword();
			Boolean match=Arrays.equals(password, verify);
			console.format("Your password is "+ (match ? "correct":"incorrect"));
			//Clear passwords array after use
			Arrays.fill(password, 'X');
			for (int i=0;i<verify.length;i++) {
				verify[i]='X';
			}
			console.format("\nPasswords cleared");
			
		}
	}
}
