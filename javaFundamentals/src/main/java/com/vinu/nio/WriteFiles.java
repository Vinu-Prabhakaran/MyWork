package com.vinu.nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFiles {

	public static void main(String[] args) {
		Path p1 = Paths.get("D:\\WorkBench\\MyEclipseworkSpace\\MyWork\\IOArea\\PathWrite1.txt");
		BufferedWriter bw = null;
		try {
			bw = Files.newBufferedWriter(p1,Charset.forName("UTF-16"));
			System.out.println("Created buffered Writer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String content="Hello";
		try {
			bw.write(content);
			System.out.println("Written to file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
