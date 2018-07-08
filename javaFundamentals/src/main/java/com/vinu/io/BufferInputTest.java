package com.vinu.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		byte buffer[]= new byte[100];
		try {
			FileInputStream f1 = new FileInputStream("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt");
			BufferedInputStream br = new BufferedInputStream (f1);
			br.read(buffer,0,80);
			System.out.println(new String(buffer));
			br.close();
		}catch (Exception e) {
			System.out.println("Exception "+e.toString());
		}
	}

}
