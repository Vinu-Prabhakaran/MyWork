package com.vinu.ocpchap4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Function;


public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		//******* Supplier
		Supplier<ArrayList<String>> s1 = () -> new ArrayList<String>();
		Supplier<ArrayList<String>> s2 = ArrayList<String>::new;	//Constructor method reference
		
		ArrayList<String> a1= s1.get();
		System.out.println(a1);
		System.out.println(s2.get());
		
		//******* Consumer
		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("Printing using consumer...");
		Consumer<String> c2 = System.out::println;
		c2.accept("Printing using lambda consumer...");
		
		//******* BiConsumer
		Map<String,Integer> m1 = new HashMap<>();
		BiConsumer<String,Integer> bc = m1::put;	//equivalent to (k,v) -> m1.put(k,v)
		
		bc.accept("Vinu", 998);
		bc.accept("Arun", 153);
		System.out.println(m1);
		
		//******* Predicate
		Predicate<String> p1 = (s) -> s.startsWith("V");
		System.out.println(p1.test("Vinu"));
		System.out.println(p1.test("Ramya"));
		Predicate<String> p2 = String::isEmpty;		// or (s) -> s.isEmpty()
		System.out.println("Result of empty check "+p2.test(""));
		//******* BiPredicate
		BiPredicate<String,String> bp1 = (str1,str2) -> str1.startsWith(str2);	//or String::startsWith
		System.out.println("Does Standard start with Stand ? "+bp1.test("Standard", "Stand"));
		
		//******* Function
		Function<String,Integer> f1 = String::length;	//(s) -> s.length()
		System.out.println("Length of Vinu is "+f1.apply("Vinu"));
		//******* BiFunction
		BiFunction<String,Integer,Character> bf1 = String::charAt;
		System.out.println("Charcter at index position 2 of Ramya is "+bf1.apply("Ramya", 2));
		
		//******* UnaryOpertaor
		UnaryOperator<String> u1 = String::toUpperCase;
		System.out.println("Converting abcd to upperCase :"+u1.apply("abcd"));
		//******* BinaryOpertaor
		BinaryOperator<String> b1 = String::concat;
		System.out.println("Concatenating abcd to efgh :"+b1.apply("abcd","efgh"));
	}

}
