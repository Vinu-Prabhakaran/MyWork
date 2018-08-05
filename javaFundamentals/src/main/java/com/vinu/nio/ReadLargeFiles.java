package com.vinu.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class ReadLargeFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\WorkBench\\MyEclipseworkSpace\\MyWork\\IOArea\\File2.txt");
		
		try(Stream<String> str = Files.lines(p1)){
			//print all lines
			//str.forEach(System.out::println);
			
			// added filter to print lines starting with J only
			System.out.println("Filtered contents ");
			str.filter(s -> s.toString().startsWith("J")).forEach(System.out::println);
			
			
			
		}
	}

}
