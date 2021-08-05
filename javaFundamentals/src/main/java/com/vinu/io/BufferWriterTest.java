package com.vinu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//Sample program to test BufferedWriter class.The file content is read as a character array
public class BufferWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buffRead=null;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/IO/BuffWriterOut.txt"));
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/IO/File2.txt"));
			
			while((buffRead = br.readLine()) != null) {
				bw.write(buffRead);
			}
			System.out.println("File contents copied...");
			bw.close();
			br.close();
		}catch (Exception e){
			System.out.println("Exception - "+e.toString());
		}
		
	}

}

