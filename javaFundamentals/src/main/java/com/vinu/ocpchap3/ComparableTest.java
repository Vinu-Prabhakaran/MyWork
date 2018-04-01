package com.vinu.ocpchap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Duck implements Comparable<Duck>{
	String name;
	
	public Duck(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Duck o) {
		
		return name.compareTo(o.name);
		//return o.name.compareTo(name);	for descending sort
	}
	
}
class Employee implements Comparable<Employee>{
	Integer id;
	
	public Employee(Integer id) {
		this.id=id;
	}
	@Override
	public String toString() {
		return id.toString();
	}

	@Override
	public int compareTo(Employee e) {
		
		return id - e.id;
		//return e.id - id;	for descending sort
	}

	
}

public class ComparableTest {

	public static void main(String[] args) {
		
		//Implementing comparable on String
		List<Duck> dl = new ArrayList<>();
		dl.add(new Duck("Huey"));
		dl.add(new Duck("Dewy"));
		dl.add(new Duck("Louie"));
		System.out.println("Initial Duck List "+dl);
		Collections.sort(dl);
		System.out.println("Duck List after sort"+dl);
		
		//Implementing comparable on integer
		List<Employee> el = new ArrayList<>();
		el.add(new Employee(3456));
		el.add(new Employee(2345));
		el.add(new Employee(1234));
		System.out.println("Initial Employee List "+el);
		Collections.sort(el);
		System.out.println("Employee List after sort"+el);
		

	}

}
