package com.vinu.io;

import java.io.RandomAccessFile;
import java.util.Date;

//***  To Test Random access files
public class FileRandomAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAccessFile rf;
		Date dt = new Date();
		String lineRead;
		try {
			rf = new RandomAccessFile("src/main/resources/IO/File1.txt","rw");
			rf.seek(rf.length());
			rf.writeBoolean(true);
			rf.writeInt(1234);
			
			rf.write(dt.toString().getBytes());  // or rf.writeBytes(dt.toString());
			rf.seek(0);
			System.out.println(rf.readBoolean());
			System.out.println(rf.readInt());
			//System.out.println(rf.readLine());  // Prints entire line from current pointer position
			System.out.println(rf.readLine().substring(0,28));
			//Read till end of File
			while ((lineRead = rf.readLine()) != null) {
				System.out.println(lineRead);
			}
			System.out.println("End of file...");
			
			rf.close();
		}catch(Exception e) {
			System.out.println("Exception hit "+e.toString());
		}
		
	}

}
