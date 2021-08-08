/**
 * 
 */
package com.vinu.ocpchap8;

import java.awt.image.BufferedImageFilter;
import java.io.*;


/**
 * @author Vinu Prabhakaran
 *         on Aug 5, 2021
 *
 */
public class FileCopyBufferedReader {
	
	public static void main(String[] args) {
		File f1=new File("src/main/resources/IO/File4.txt");
		File f2=new File("src/main/resources/IO/File4-copy.txt");
		copyFile(f1,f2);
	}


	private static void copyFile(File fin, File fout) {
		try(BufferedReader fi=new BufferedReader(new FileReader(fin));
				BufferedWriter fo=new BufferedWriter(new FileWriter(fout));){
			String line=null;
			while((line=fi.readLine()) != null) {
				fo.write(line);
				fo.newLine();
			}
			System.out.println(fin.getName()+" copied to "+fout.getName());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}
