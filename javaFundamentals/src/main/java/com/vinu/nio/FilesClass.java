package com.vinu.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\WorkBench\\JAVA_Work\\IOArea\\File2.txt");
		Path p2 = Paths.get("../IOArea1/newDir");
		//Path p3 = Paths.get("D:\\WorkBench\\JAVA_Work\\IOArea\\File1.txt");
		Path p4 = Paths.get("../IOArea");
		
		//Checking if a file or directory exists
		System.out.println("Does p1 exist ? "+ Files.exists(p1));
		System.out.println("Does p4 directory exist ? "+ Files.exists(p4));
		
		//createDirectory assumes that parent directories are present. Here in this case IOArea1 should be present
		//createDirectories will create necessary parent
		Files.createDirectories(p2);
		
		//copying files doesn't overwrite destination
		Files.copy(p1, Paths.get("../IOArea1/newDir/File2copy.txt"));
		Files.copy(p4, Paths.get("../IOArea1/newDir/newIOArea"));  //only creates the newIOArea directory.doesnt copy anything
		
		//Moving files and directories
		Files.move(Paths.get("../IOArea2"),Paths.get("../IOArea1/newDir/IOArea2copy"));  //entire contents of source dir will be moved
		Files.move(Paths.get("../IOArea/Filetomove.txt"),Paths.get("../IOArea1/newDir/Filemoved.txt"));
		
		//Deleting file or empty directory
		Files.delete(Paths.get("D:\\WorkBench\\JAVA_Work\\IOArea1\\newDir\\newIOArea"));
		
		}

}
