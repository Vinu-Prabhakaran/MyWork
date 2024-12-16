package com.vinu.ocpchap4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		
		Stream<Double> randomDouble=Stream.generate(() -> Math.random());
		System.out.println("Random doubles generated using Stream");
		randomDouble.limit(10).forEach(System.out::println);
		Stream<Integer> oddNumbers=Stream.iterate(1, n -> n+2);
		System.out.println("Odd numbers generated using Stream");
		oddNumbers.limit(20).forEach(System.out::println);
		
		Stream<String> s = Stream.of("Vinu","Ramya","Ammu","Kunji");
		System.out.println("count() : "+s.count());
		List<String> nameList = Arrays.asList("VinuCP","Ramya","Ameya","Kunji","Ammu");
		System.out.println("Min based on alpha order : "+nameList.stream().min((s1,s2) -> s1.charAt(0) - s2.charAt(0)));
		System.out.println("Min based on length : "+nameList.stream().min((s1,s2) -> s1.length() - s2.length()));
		System.out.println("FindAny : "+nameList.stream().findAny());
		
		Stream<String> s2=nameList.stream().filter(x -> x.endsWith("u"));
		s2.forEach(System.out::println);
		
		List<String> list = Arrays.asList("monkey", "2", "chimp");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred)); // true
		System.out.println(list.stream().allMatch(pred)); // false
		System.out.println(list.stream().noneMatch(pred)); // false
		System.out.println(infinite.anyMatch(pred)); // true
		
		System.out.println("Lets see reduce() now");
		List<String> letters = Arrays.asList("V","i","n","u");
		
		System.out.println("Concatenation Result :"+letters.stream().reduce("", (a,b) -> a+b));
		
		BinaryOperator<Integer> op=(a,b) -> a*b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(2,3,4);
		
		empty.reduce(op).ifPresent(System.out::println);			//no output
		oneElement.reduce(op).ifPresent(System.out::println);		//same element printed
		threeElements.reduce(op).ifPresent(System.out::println);	//result of BinaryOperation printed
		
		System.out.println("**** collect() *****");
		//System.out.println(letters.stream().collect(StringBuilder::new,StringBuilder::append,StringBuilder::append));
		
		System.out.println("Time for Intermediate Operations");
		
		System.out.println("***filter()***");
		nameList.stream().filter(s1 -> s1.startsWith("A")).forEach(System.out::println);
		
		System.out.println("*** distinct() ***");
		nameList.stream().distinct().forEach(System.out::println);
		
		System.out.println("*** limit and skip***");
		nameList.stream().skip(1).limit(2).forEach(System.out::println);
		
		System.out.println("*** map() ***");
		nameList.stream().map(s1-> s1.charAt(0)).forEach(System.out::println);
		
		System.out.println("*** sorted() ***");
		nameList.stream().sorted().forEach(System.out::println);
		System.out.println("*** sorted() by length***");
		nameList.stream().sorted((a1,a2)-> a1.length()-a2.length()).forEach(System.out::println);
		nameList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("*** peek() ***");
		System.out.println(nameList.stream().peek(System.out::println).limit(3).count());
		
		
		
	}
}
