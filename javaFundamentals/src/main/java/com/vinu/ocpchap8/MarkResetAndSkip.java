/**
 * 
 */
package com.vinu.ocpchap8;

import java.io.*;

/**
 * @author Vinu Prabhakaran
 *         on Aug 1, 2021
 *
 */
public class MarkResetAndSkip {
	
	public static void main(String[] args) {
		
		try(InputStream is = new BufferedInputStream(new FileInputStream("src/main/resources/IO/temp_file.txt"));){
			
			System.out.println("Supports Mark?"+is.markSupported());
			System.out.println((char) is.read());
			
			if (is.markSupported()) {
				System.out.println("MarkNow");
				is.mark(100);
				System.out.print((char) is.read());
				System.out.print((char) is.read());
				System.out.print((char) is.read());
				System.out.print((char) is.read());
				System.out.println("\nReset Now");is.reset();
				System.out.print((char) is.read());
				System.out.print((char) is.read());
				System.out.print((char) is.read());
				System.out.print((char) is.read());
			}
			System.out.println("\nSkipping 11 bytes");
			is.skip(11);
			System.out.print((char) is.read());
			System.out.print((char) is.read());
			System.out.print((char) is.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		};
		
	}
}
