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
public class FileCopyInputStream {
	
	public static void main(String[] args) {
		
		File f1=new File("src/main/resources/IO/File1.txt");
		File f2=new File("src/main/resources/IO/File1-copy.txt");
		File f3=new File("src/main/resources/IO/File1-ByteArraycopy.txt");
		copyFile(f1,f2);
		copyFileUsingByteArray(f1, f3);
		
	}
	
	public static void copyFile(File fin, File fout) {
		
		try(InputStream fi=new FileInputStream(fin);
				OutputStream fo=new FileOutputStream(fout);){
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
	
public static void copyFileUsingByteArray(File fin, File fout) {
		
		try(InputStream fi=new FileInputStream(fin);
				OutputStream fo=new FileOutputStream(fout);){
			byte[] buffer=new byte[100];
			int b;
			while((b= (fi.read(buffer))) != -1) {
				fo.write(buffer, 0, b);
			}
			System.out.println(fin.getName()+" copied using byteArray to "+fout.getName());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
