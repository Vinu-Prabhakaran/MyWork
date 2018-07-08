package com.vinu.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt");
		
		if(Files.isDirectory(p1)) {
			try(Stream<Path> fileData=Files.list(p1)){
			
				fileData.forEach(System.out::println);
			}
		}else {
			try(Stream<Path> fileData1=Files.list(p1.getParent())){
				
				fileData1.forEach(System.out::println);
			}
		}

	}

}
