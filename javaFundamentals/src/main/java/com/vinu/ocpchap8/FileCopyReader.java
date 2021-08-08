/**
 * 
 */
package com.vinu.ocpchap8;

import java.io.*;


/**
 * @author Vinu Prabhakaran
 *         on Aug 5, 2021
 *
 */
public class FileCopyReader {
	
	public static void main(String[] args) {
		File f1=new File("src/main/resources/IO/File2.txt");
		File f2=new File("src/main/resources/IO/File2-copy.txt");
		File f3=new File("src/main/resources/IO/File2-CharArraycopy.txt");
		copyFile(f1,f2);
		copyFileUsingCharArray(f1,f3);
	}


	private static void copyFile(File fin, File fout) {
		try(Reader fi=new FileReader(fin);
				Writer fo=new FileWriter(fout);){
			int b;
			while((b= (fi.read())) != -1) {
				fo.write(b);
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
	
	private static void copyFileUsingCharArray(File fin, File fout) {
		try(Reader fi=new FileReader(fin);
				Writer fo=new FileWriter(fout);){
			int b;
			char[] buffer=new char[100];
			while((b= (fi.read(buffer))) != -1) {
				fo.write(buffer,0,b);
			}
			System.out.println(fin.getName()+" copied using charArray to "+fout.getName());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
