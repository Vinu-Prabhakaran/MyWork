package com.vinu.learn;

import java.io.RandomAccessFile;
//import java.util.StringTokenizer;

//A sample program to read a CSV file and map it to a schema
public class ReadLoadCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lineRead=null,delim=",";
		String layout[]= {"rowkey","name","age","country","game","role"};
		String[] strArr=null;
		//StringTokenizer st=null;
		int recCount = 0;
		try {
			RandomAccessFile rfinp = new RandomAccessFile("D:\\WorkBench\\JAVA_Work\\IOArea\\LoadFile.txt","r");
			RandomAccessFile rfout = new RandomAccessFile("D:\\WorkBench\\JAVA_Work\\IOArea\\DetailFile.txt","rw");
			while((lineRead = rfinp.readLine()) != null) {
				//st = new StringTokenizer(lineRead, delim); //Tokenize the string based on delimiter
				strArr = lineRead.split(delim);  //split based on delimiter into a String array
				recCount++;
			//System.out.println(st.countTokens());
			//System.out.println(strArr.length);
				System.out.println("~~~~~~~~~~~Details of Player #"+recCount+"~~~~~~~~~~~~~~");
				for(int i=0;i<strArr.length;i++) {
					System.out.println(layout[i]+" -->"+strArr[i]);
					rfout.write((layout[i]+" -->"+strArr[i]+"\n").getBytes()); // will write on a single line
				}
			}
			rfinp.close();
			rfout.close();
		}catch(Exception e) {
			System.out.println("Exception "+e.toString());
		}
	}

}
