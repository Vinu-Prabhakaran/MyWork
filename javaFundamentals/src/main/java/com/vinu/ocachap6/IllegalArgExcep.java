package com.vinu.ocachap6;


class Egg{
	int numberOfEggs;
	
	public void setNumberOfEggs(int n) {
		if (n >= 0) {
			this.numberOfEggs = n;
		}else {
			throw new IllegalArgumentException("Number of eggs cant be negative ...");
		}
	}
	
}

public class IllegalArgExcep {

	public static void main(String[] args) {
		Egg e = new Egg();
		e.setNumberOfEggs(-1);

	}

}
