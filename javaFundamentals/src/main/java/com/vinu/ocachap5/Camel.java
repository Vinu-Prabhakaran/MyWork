package com.vinu.ocachap5;

public class Camel {

	private String getNumberOfHumps() {
	return "Undefined";
	}
}
class BactrianCamel extends Camel {
	public int getNumberOfHumps() { // DOES NOT COMPILE
	return 2;
	}
}
