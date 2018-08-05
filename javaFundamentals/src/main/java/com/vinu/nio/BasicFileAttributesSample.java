package com.vinu.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\WorkBench\\MyEclipseworkSpace\\MyWork\\IOArea\\file2.txt");
		
		System.out.println("Is path a directory ? "+Files.isDirectory(p1));
		System.out.println("Is path a file ? "+Files.isRegularFile(p1));
		System.out.println("Last modified time is "+Files.getLastModifiedTime(p1));
		
		System.out.println("Updating modified time "+Files.setLastModifiedTime(p1, FileTime.fromMillis(System.currentTimeMillis())));
		
		System.out.println("Owner is "+Files.getOwner(p1).getName());
		
		//Using view to access file attributes
		System.out.println("***File attributes using view***");
		BasicFileAttributes data = Files.readAttributes(p1,BasicFileAttributes.class);
		System.out.println("Is path a directory? "+data.isDirectory());
		System.out.println("Is path a regular file? "+data.isRegularFile());
		System.out.println("Is path a symbolic link? "+data.isSymbolicLink());
		System.out.println("Path not a file, directory, nor symbolic link? "+data.isOther());
		System.out.println("Size (in bytes): "+data.size());
		System.out.println("Creation date/time: "+data.creationTime());
		System.out.println("Last modified date/time: "+data.lastModifiedTime());
		System.out.println("Last accessed date/time: "+data.lastAccessTime());
		System.out.println("Unique file identifier (if available): "+data.fileKey());
		
	}

}
