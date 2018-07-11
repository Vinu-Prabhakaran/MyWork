package com.vinu.io;

import java.io.File;

public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirName="D:\\WorkBench\\JAVA_Work\\IOArea";
		
		File f  = new File(dirName);
		File f1 = new File(dirName,"File1.txt");
		File f2,f3;
		System.out.println("File Path is "+f1.getPath());
		System.out.println("Parent Directory is "+f1.getParent());
		String[] list = f.list();
		System.out.println("# of list items is "+list.length);
		System.out.println("File exists?"+f.exists());
		
		System.out.println("Absolute path of File is "+f.getAbsolutePath());
		
		for (String li : list) {
			//System.out.println(li);
			f2 = new File(dirName+"\\"+li);  // We can use a forward slash / as well instead of double backslash
			if (f2.isDirectory()){
				System.out.println(li+" is a directory");
			}else {
				System.out.println(li+" is a file");
			}
		}
		if(f1.renameTo(new File(dirName,"newFile1.txt"))) {
			System.out.println("File1 is renamed...");
		}
		f3 = new File(dirName,"File3.txt");
		if(f3.delete()) {
			System.out.println("File3 deleted");
		}
	}

}
