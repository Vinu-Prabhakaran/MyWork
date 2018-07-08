package com.vinu.ocpchap1;

import com.vinu.ocpchap2.Seasons;

public class EnumTest {
	
	public static void main(String[] args) {
		
		Seasons s1 = Seasons.FALL;
		System.out.println(s1==Seasons.FALL);
		
		for(Seasons s: Seasons.values()) {
			System.out.println(s);
		}
		
		System.out.println("Printing name and ordinal");
		for(Seasons s: Seasons.values()) {
			System.out.println(s.name()+":"+s.ordinal());
		}
	}
}
