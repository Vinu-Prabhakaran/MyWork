/**
 * 
 */
package com.vinu.ocpchap8;

/**
 * @author Vinu Prabhakaran
 *         on Aug 6, 2021
 *
 */
import java.io.*;
public class PrintWriterSample {
	
	public static void main(String[] args) throws IOException {
		File source = new File("src/main/resources/IO/zoo.log");
		try (PrintWriter out = new PrintWriter(
			new BufferedWriter(new FileWriter(source)))) {
			out.print("Today's weather is: ");
			out.println("Sunny");
			out.print("Today's temperature at the zoo is: ");
			out.printf("%02.3f",100/3.0);
			out.println('C');
			out.format("It has rained %f inches this year",10.2);
			out.println();
			out.printf("It may rain %d more inches this year",10);
		}
		
	}
}
