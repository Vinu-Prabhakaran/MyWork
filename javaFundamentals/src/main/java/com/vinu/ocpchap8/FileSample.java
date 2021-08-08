/**
 * 
 */
package com.vinu.ocpchap8;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Vinu Prabhakaran
 *         on Jul 29, 2021
 *
 */
public class FileSample {
	
	public static void main(String[] args) {
		System.out.println(String.format("%03d", 10));
		System.out.println(System.getProperty("file.separator"));
		File f1=new File("src/main/resources/IO/temp_file.txt");
		System.out.println("File exists? :"+f1.exists());
		System.out.println(f1.getName());
		if (f1.exists()) {
			System.out.println("GetName :"+f1.getName());
			System.out.println("AbsolutePath :"+f1.getAbsolutePath());
			System.out.println("ParentPath :"+f1.getParent());
			if (f1.isFile()) {
				System.out.println("File Size (in bytes) :"+f1.length());
				System.out.println("Last Modified :"+f1.lastModified()+ " millis = "+
				LocalDateTime.ofInstant(Instant.ofEpochMilli(f1.lastModified()), ZoneId.systemDefault()));
			} else {
				System.out.println("Contents of Directory");
				for (File file: f1.listFiles()) {
					System.out.println(file.getName());
				}
			}
		}	
	}
}
