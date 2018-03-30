package com.vinu.ocpchap3;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		System.out.println(s1.add(233));
		System.out.println(s1.add(11));
		System.out.println(s1.add(10));
		System.out.println(s1.add(10));
		
		System.out.println(s1);
		
		Set<Integer> s2 = new TreeSet<>();
		System.out.println(s2.add(233));
		System.out.println(s2.add(13));
		System.out.println(s2.add(12));
		System.out.println(s2.add(10));
		
		System.out.println(s2);
				
		/* Methods available on TreeSets implementing NavigableSet
		E lower(E e) Returns greatest element that is < e, or null if no such element
		E floor(E e) Returns greatest element that is <= e, or null if no such element
		E ceiling(E e) Returns smallest element that is >= e, or null if no such element
		E higher(E e) Returns smallest element that is > e, or null if no such element
		*/
		
		NavigableSet<Integer> set = new TreeSet<>();
		for (int i = 1; i <= 20; i++) set.add(i);
		System.out.println(set.lower(10)); 		// 9
		System.out.println(set.floor(10)); 		// 10
		System.out.println(set.ceiling(20)); 	// 20
		System.out.println(set.higher(20)); 	// null

	}
	
	
}
