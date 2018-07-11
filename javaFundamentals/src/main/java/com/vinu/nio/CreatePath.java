package com.vinu.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt");
		Path p2 = Paths.get("../IOArea/Data.txt");
		Path p3 = Paths.get("D:\\WorkBench\\JAVA_Work\\IOArea\\File1.txt");
		Path p4 = Paths.get("../IOArea");
		
		System.out.println("p2 is absolute? "+p2.isAbsolute());
		System.out.println(p1.toUri());
		
		System.out.println("Absolute path of p2 is "+p2.toAbsolutePath().normalize());
		System.out.println("# of elements in p1 is "+p1.getNameCount());
		
		for (int i=0;i<p1.getNameCount();i++) {
			System.out.println("Element "+i+" :"+p1.getName(i));
		}
		
		System.out.println("Root of p1 - "+p1.getRoot());
		System.out.println("Root of p2 - "+p2.getRoot());  //returns null for relative path object
		
		System.out.println("Current Parent of p1 - 	"+p1.getParent());
		System.out.println("Current Parent of p2 - 	"+p2.getParent());
		
		System.out.println("FileName of p1 - 	"+p1.getFileName());  //returns farthest element from root
		System.out.println("FileName of p2 - 	"+p2.getFileName());  //returns farthest element from root
		System.out.println("FileSystem of p1 - 	"+p1.getFileSystem());
		
		//relativize
		System.out.println(p1.relativize(p3));
		System.out.println(p2.relativize(p4));
		
		//resolve
		System.out.println(p1.resolve(p3)); // both are absolute paths so second one will be taken
		System.out.println(p1.resolve(p4)); // second one is relative so will be appended
		System.out.println(p2.resolve(p4));
		System.out.println(p2.resolve(p3)); //absolute path is retained
		
		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		//Path path5 = Paths.get("\\home\\data");
		Path relativePath = path3.relativize(path4);
		System.out.println(relativePath);
		System.out.println(p3.resolve(relativePath));
		//System.out.println(path3.relativize(path5)); // this will fail since one is absolute and another relative
		
		System.out.println("Normalized value - "+p3.resolve(relativePath).normalize());
		
		System.out.println(p2.toRealPath());  // Displays real path also checks if file exists
		//System.out.println(path3.toRealPath()); // returns NoSuchFileException
		
		System.out.println(Paths.get(".").toRealPath());
		
		//Creating Path using FIleSystem methods
		Path pa1 = FileSystems.getDefault().getPath("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt");
		System.out.println(pa1.getFileName());
		
		Path pa2= Paths.get(".");
		System.out.println(pa2.getNameCount());
		

		
	}

}
