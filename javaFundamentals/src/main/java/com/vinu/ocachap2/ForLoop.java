package com.vinu.ocachap2;

public class ForLoop {

//for loop check this
	public static void main(String[] args) {
		int x= 0;
		System.out.println("From first for loop");
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
		System.out.print(y + " ");
		}
		System.out.print(x);
		
		System.out.println("\nFrom 2nd for loop");
		int x1 = 0;
		//for(long y1 = 0, x1 = 4; x1 < 5 && y1 < 10; x1++, y1++) { // DOES NOT COMPILE
		long y1;
		for(y1 = 0, x1 = 4; x1 < 5 && y1 < 10; x1++, y1++) {
		System.out.print(x1 + " ");
		}
		
		java.util.List<String> names = new java.util.ArrayList<String>();
		names.add("Vinu");
		names.add("Ramya");
		names.add("Ameya");
		names.add("Aditi");
		System.out.println("\nFrom ArrayList");
		for (int i=0;i<names.size();i++){
			if(i>0){
				System.out.print(",");
			}
			System.out.print(names.get(i));
		}
		
		int count = 0;
		ROW_LOOP: for(int row = 1; row <=3; row++)
		for(int col = 1; col <=2 ; col++) {
			if(row * col % 2 == 0) continue ROW_LOOP;
			count++;
		}
		System.out.println("\n"+count);
		
		//is this an infinite loop
		for(int i=0; i<10 ; ) {
			System.out.println("i ="+i);
			i = i++;
			//i=++i; identify the difference made by this code to the result
			System.out.println("Hello World");
		}
		
	}
}