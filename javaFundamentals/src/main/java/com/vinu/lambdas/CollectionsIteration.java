package com.vinu.lambdas;

import java.util.Arrays;
import java.util.List;

class Person{
	
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	
}

public class CollectionsIteration {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Vinu","Prabhakaran",33),
				new Person("Ramya","Vinu",30),
				new Person("Ameya","Vinu",5),
				new Person("Aditi","Vinu",1)
				);
		
		//Printing using for loop
		System.out.println("List iteration using for loop");
		
		for (int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		
		//Printing using for in loop
		System.out.println("List iteration using for-in loop");
		
		for (Person p:people) {
			System.out.println(p);
		}
		
		//Printing using lambda forEach
		System.out.println("List iteration using forEach");
		people.forEach(p -> System.out.println(p));
		
		//Printing using lambda forEach method reference
		System.out.println("List iteration using forEach method reference");
		people.forEach(System.out::println);
	}

}
