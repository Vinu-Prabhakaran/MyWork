/**
 * 
 */
package com.vinu.ocpchap6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Vinu Prabhakaran
 *         on Jul 19, 2021
 *
 */
public class TryWithResources {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Something");
			System.out.println("Entered :"+sc.next());
		} 
		
		try(BufferedReader r = Files.newBufferedReader(Paths.get("src/main/resources/Zoo_en.properties"));
				BufferedWriter w = Files.newBufferedWriter(Paths.get("src/main/resources/temp_file.txt"))){
			r.lines().forEach(l -> {
				try {
					w.write(l);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch(IOException e) { 
			
		}
	}
}

