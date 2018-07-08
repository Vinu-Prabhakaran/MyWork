package com.vinu.ocpchap1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

 class TestToString {
	
	String name;
	int age;
	String country;
	
	

	public TestToString(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public String toString() {
		//return ToStringBuilder.reflectionToString(this);
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
		}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestToString p1 = new TestToString("Vinu",33,"India");
		System.out.println("P1 Details -"+p1);
	}

}
