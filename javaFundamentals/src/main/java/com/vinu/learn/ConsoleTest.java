package com.vinu.learn;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

//Console class tries to implement a platform independent way to handle with console input. 
//All OS has a console in any way, but they are quiet different in implementation. 
//So Console class gives you a Java platform independent runtime class to access things like password input, etc.
//
//Scanner is used for parsing tokens from the contents of the stream while BufferedReader just 
//reads the stream and does not do any special parsing.

//**** NOte that this will not work on Eclipse but works fine when invoked from cmd.
public class ConsoleTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Console console = System.console();
			
			if (console == null){
				System.out.println("No Console support in Eclipse..But try this code from cmd and it works ...");
			}else {
				System.out.println("Enter name...");
				 
				//The flush() method forces any buffered output to be written immediately. It is recommended that
				//you call the flush() method prior to calling any readLine() or readPassword()
				console.flush();
				
				String userInp = console.readLine();
				console.writer().println("Hello "+userInp);
				
				console.writer().println("What is your age..");
				console.flush();
				
				//Following is just another method to get user input -  creating a BufferedReader out of the
				//console.read() object.
				BufferedReader reader = new BufferedReader(console.reader());
				String value = reader.readLine();
				int age = Integer.valueOf(value);
				console.printf("Your age is "+age);
				
				char[] password = console.readPassword("Enter Your Password...");
				char[] verify = console.readPassword("Confirm Your Password...");
				
				boolean match = Arrays.equals(password, verify); // matching char arrays
				
				if (match) {
					console.writer().println("Passwords match...");
				} else {
					console.writer().println("Sorry ..Passwords doesnt match");
				}
				
				//Clear passwords just for security purpose
				for (int i=0;i<password.length;i++) {
					password[i]= 'X';
				}

				for (int i=0;i<verify.length;i++) {
					verify[i]= 'X';
				}
				
				console.writer().println("Welcome to Our Zoo!");
				console.format("Our zoo has 391 animals and employs 25 people.");
				console.writer().println(); //format needs explicit newline;
				console.printf("The zoo spans 128.91 acres.");
				console.printf("Current Temperature is "+ 100/3 +"C");
				
				
			}
	}

}
