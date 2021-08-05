package com.vinu.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buffRead=null;
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("src/main/resources/IO/PrintWriterOut.txt"));
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/IO/File2.txt"));
			
			while((buffRead = br.readLine()) != null) {
				pw.print(buffRead); // println(buffRead) inserts new line after printing.
				pw.printf(buffRead);
				pw.format(buffRead); //doesnt include a new line after format 
				pw.println();
			}
			System.out.println("File contents copied...");
			pw.close();
			br.close();
		}catch (Exception e){
			System.out.println("Exception - "+e.toString());
		}

	}

}
