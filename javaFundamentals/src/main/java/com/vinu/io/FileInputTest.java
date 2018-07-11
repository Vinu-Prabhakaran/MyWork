package com.vinu.io;

import java.io.FileInputStream;

//Test FileInputStream
public class FileInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buffer=new byte[100];
		String str;
		FileInputStream f1;
		try {
			f1 = new FileInputStream("D:/WorkBench/JAVA_Work/IOArea/File3.txt");
			f1.read(buffer);
			System.out.println(buffer.toString());  //wont print properly
			str = new String(buffer);
			System.out.println(str);
			f1.close();
		}catch (Exception e) {
			System.out.println("Exception "+e.toString());
		}
		
		
	}

}
