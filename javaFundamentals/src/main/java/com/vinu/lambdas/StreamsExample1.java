package com.vinu.lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Vinu","Prabhakaran",33),
				new Person("Ramya","Vinu",30),
				new Person("Ameya","Vinu",5),
				new Person("Aditi","Vinu",1)
				);
		
				
		//Printing using lambda forEach method reference
		System.out.println("List iteration using forEach method reference");
		people.forEach(System.out::println);
		
		//Adding multiple operations for each element using stream
		System.out.println("Persons whose firstName starts with 'A' ");
		people.stream()			// creates a Stream out of people List
		.filter(p -> p.getFirstName().startsWith("A"))	// filters Person objects for firstName
		.filter(p -> p.getAge() > 2)					// filters results from above filer based on age
		.forEach(System.out::println);					// print final result
	}

}
