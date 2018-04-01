package com.vinu.ocpchap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Turtle implements Comparable<Turtle>{
	String name;
	int weight;
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Turtle(String name) {
		this.name=name;
	}
	
	public Turtle(String name,int weight) {
		this.name=name;
		this.weight=weight;
	}
	
	@Override
	public String toString() {
		return "["+name+","+weight+"]";
	}

	@Override
	public int compareTo(Turtle o) {
		
		return name.compareTo(o.name);
		//return o.name.compareTo(name);	for descending sort
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		List<Turtle> tl = new ArrayList<>();
		tl = Arrays.asList(new Turtle("Pinku",100),
						 	new Turtle("Jinku",50),
							new Turtle("Dinku",120));
		System.out.println("Initial Turtle List "+tl);
		Collections.sort(tl);
		System.out.println("Turtle List sorted by name :"+tl);
		
		//Implementing Comparator as anonymous class to sort in ascending order
		Comparator<Turtle> byWeight = new Comparator<Turtle> () {

			@Override
			public int compare(Turtle o1, Turtle o2) {
				
				return o1.getWeight() - o2.getWeight();
			}
	
		};
		
		Collections.sort(tl,byWeight);
		System.out.println("Turtle List sorted by weight :"+tl);
		System.out.println("Now its time for lambdas ... Lets sort by descending weight");
		Collections.sort(tl,(t1,t2) -> t2.getWeight() - t1.getWeight());
		System.out.println("Turtle List sorted by descending weight :"+tl);
	}

}
