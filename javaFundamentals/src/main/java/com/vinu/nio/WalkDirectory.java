package com.vinu.nio;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WalkDirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\WorkBench\\JAVA_Work\\javaFundamentals");
		
		try(Stream<Path> result = Files.walk(p1,FileVisitOption.FOLLOW_LINKS)){
			//lambda expression used below to filter results in the stream
			result.filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
		}
	}


}
