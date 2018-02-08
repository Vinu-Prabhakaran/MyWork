package com.vinu.learn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buffRead=null;
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("D:\\WorkBench\\JAVA_Work\\IOArea\\PrintWriterOut.txt"));
			BufferedReader br = new BufferedReader(new FileReader("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt"));
			
			while((buffRead = br.readLine()) != null) {
				pw.print(buffRead);
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
