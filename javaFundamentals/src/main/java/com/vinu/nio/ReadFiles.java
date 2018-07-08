package com.vinu.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt");
		
		BufferedReader br = Files.newBufferedReader(p1);
		String s = null;
		
		System.out.println("Contents of the file follows...");
		while((s = br.readLine()) != null) {
			System.out.println(s);
			
		}
		
		//readAllLines will read all contents into a String List
		//recommended for smaller files
		List<String> allData;
		allData = Files.readAllLines(p1);
		
		System.out.println("Read result from readAllLines");
		for (String line:allData) {
			System.out.println(line);
		}
	}

}
