package com.vinu.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadLargeFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt");
		
		// added filter to print lines starting with J only
		Files.lines(p1).filter(s -> s.toString().startsWith("J")).forEach(System.out::println);

	}

}
