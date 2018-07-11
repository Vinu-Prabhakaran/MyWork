package com.vinu.ocachap3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		//LocalDate
		//public static LocalDate of(int year, int month, int dayOfMonth)
		//public static LocalDate of(int year, Month month, int dayOfMonth)
		LocalDate date1 = LocalDate.of(2018, Month.FEBRUARY, 19);
		System.out.println(date1);
		
		//LocalTime signatures follow
		//public static LocalTime of(int hour, int minute)
		//public static LocalTime of(int hour, int minute, int second)
		//public static LocalTime of(int hour, int minute, int second, int nanos)
		LocalTime time1 = LocalTime.of(16, 03);
		LocalTime time2 = LocalTime.of(13,15,14,1000001);
		System.out.println(time1+"  "+time2);
		
		//LocalDateTime
		
		LocalDateTime datetime1 = LocalDateTime.of(LocalDate.now(), LocalTime.of(10,10,56));
		System.out.println(datetime1);
		
		System.out.println(LocalDateTime.now().plusDays(2));
		
		Period period = Period.ofDays(3);
		System.out.println("time1 + 3 days "+date1.plus(period));
		
		System.out.println(datetime1.getDayOfMonth());
		System.out.println(datetime1.getDayOfWeek());
		System.out.println(datetime1.getDayOfYear());
		
		System.out.println("Current time to Epoch Seconds");
		System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.ofTotalSeconds(0)));
		
		
		System.out.println("Current time to Epoch Days");
		System.out.println(LocalDate.now().toEpochDay());
		
		
				
	}

}
