package com.vinu.ocpchap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {
	static class Rabbit implements Comparable<Rabbit>{
		
		int id;
		public Rabbit(int i) {
			id =i;
		}
		
		public String toString() {
			return "[id = "+id+"]";
		}

		@Override
		public int compareTo(Rabbit o) {
			// TODO Auto-generated method stub
			return id-o.id;
		}
	}
	public static void main(String[] args) {
		
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit(345));
		rabbits.add(new Rabbit(123));
		rabbits.add(new Rabbit(567));
		
		//Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
		Collections.sort(rabbits, (r1,r2) -> r1.id - r2.id);
		
		System.out.println("Sorted Rabbits :"+rabbits);
		System.out.println(Collections.binarySearch(rabbits,new Rabbit(234)));
	}

}
