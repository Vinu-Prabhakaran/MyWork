package com.vinu.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

//Sample program to test FileWriter class.The file content is read as a character array
public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buffRead=null;
		try {
			FileWriter fw = new FileWriter("D:\\WorkBench\\JAVA_Work\\IOArea\\FileWriterOut.txt");
			BufferedReader br = new BufferedReader(new FileReader("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt"));
			
			while((buffRead = br.readLine()) != null) {
				fw.write(buffRead);
			}
			System.out.println("File contents copied...");
			fw.close();
			br.close();
		}catch (Exception e){
			System.out.println("Exception - "+e.toString());
		}

	}

}
