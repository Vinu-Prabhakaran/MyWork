package com.vinu.ocpchap3;

import java.util.HashMap;
import java.util.Map;

public class Java8NewApis {

	public static void main(String[] args) {
		
		Map<String,String> favs = new HashMap<>();
		favs.put("Jenny", "Bus Tour");
		favs.put("Jenny", "Tram");
		System.out.println(favs);
		favs.putIfAbsent("Jenny", "Train");
		favs.putIfAbsent("Sam", "Tram");
		System.out.println(favs);
		favs.compute("Jenny", (k,v) -> "Boat");
		
		System.out.println("After compute on key \"Jenny\" :"+favs);
		
		favs.computeIfPresent("Jenny",(k,v) -> v+" Ride");
		favs.computeIfPresent("Vinu",(k,v) -> "Car");
		System.out.println("After computeIfPresent on keys \"Jenny\" and \"Vinu\" :"+favs);
		
		favs.computeIfAbsent("Jenny",(k) -> "Bike");
		favs.computeIfAbsent("Vinu",(k) -> "Car");
		System.out.println("After computeIfAbsent on keys \"Jenny\" and \"Vinu\" :"+favs);
		favs.put("Ramya", null);
		
		favs.merge("Vinu", "Airplane Ride", (v1,v2) -> v2.substring(0, v2.indexOf(" ")));
		favs.merge("Ramya", "Airplane Ride", (v1,v2) -> v2.substring(0, v2.indexOf(" ")));	//since existing value is null new value will unconditionally replaced with
		System.out.println("After merge on keys \"Vinu\" and \"Ramya\" :"+favs);
		
		}

}
