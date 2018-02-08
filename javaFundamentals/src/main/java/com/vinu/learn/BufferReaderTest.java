package com.vinu.learn;

import java.io.BufferedReader;
import java.io.FileReader;

//Sample program to test BufferedReader class.The file content is read as a character array
public class BufferReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readLine ;// to store the String value returned by readLine()
		try {
			FileReader fr = new FileReader("D:\\WorkBench\\JAVA_Work\\IOArea\\LoadFile.txt");
			BufferedReader br = new BufferedReader(fr);
						
			while ((readLine=br.readLine()) != null) {
				System.out.println(readLine); 
			}
			fr.close();
		}catch (Exception e) {
			System.out.println("Exception hit "+e.toString());
		}
	}

}
