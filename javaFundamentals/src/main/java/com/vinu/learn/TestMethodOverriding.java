package com.vinu.learn;

public class TestMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareBook sb = new SoftwareBook();
		sb.setBook(120, 555, "Yashwanth Kanitkar", "Letus C");
		sb.setSWBook("C Programming", "V1");
		sb.show();
		HardwareBook hb=new HardwareBook();
		hb.setBook(52, 750, "D G Hannan", "World of Photography");
		hb.setHWBook("Camera");
		hb.show();
	}

}
