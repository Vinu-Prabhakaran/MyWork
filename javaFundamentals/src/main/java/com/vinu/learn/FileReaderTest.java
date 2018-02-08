package com.vinu.learn;

import java.io.FileReader;

//Sample program to test FileReader class.The file content is read as a character array
public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch ;// to store the int value returned by read()
		try {
			FileReader fr = new FileReader("D:\\WorkBench\\JAVA_Work\\IOArea\\LoadFile.txt");
			while ((ch=fr.read()) != -1) {
				System.out.print((char) ch); //note that print is used instead of println
			}
			fr.close();
		}catch (Exception e) {
			System.out.println("Exception hit "+e.toString());
		}
	}

}
