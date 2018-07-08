package com.vinu.ocachap6;

public class ClassCastExcep {

	public static void main(String[] args) {
		String name ="Vinu";
		Object ob = name;
		Integer num = (Integer) ob;
		System.out.println(num);

	}

}
