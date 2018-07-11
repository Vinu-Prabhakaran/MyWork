package com.vinu.ocachap5;

interface Hop{
	static int getJumpHeight() {
		return 8;
		}
}

public class Bunny implements Hop{

	static int getJumpHeight() {
		return 5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getJumpHeight());
		System.out.println(Hop.getJumpHeight());
	}

}
