package com.vinu.ocachap3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateTime {

	public static void main(String[] args) {
		
		LocalDateTime datetime1 = LocalDateTime.now();
		System.out.println(datetime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		LocalDate date = LocalDate.of(2021, Month.APRIL, 20);
		LocalTime time = LocalTime.of(11, 13, 34, 444);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("FormatStyle.SHORT - "+shortDateTime.format(dateTime));
		
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println("FormatStyle.MEDIUM - "+mediumDateTime.format(dateTime));
		
		DateTimeFormatter myFormat1 = DateTimeFormatter.ofPattern("MMM dd yyyy; hh:mm:ss");
		DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("MM D YYYY; HH:mm:ss");
		DateTimeFormatter myFormat3 = DateTimeFormatter.ofPattern("hh:mm:ss");
		
		System.out.println("\"MMM dd yyyy; hh:mm:ss\""+dateTime.format(myFormat1));
		System.out.println("\"MM D YYYY; HH:mm:ss\""+dateTime.format(myFormat2));
		System.out.println("dateTime in format \"hh:mm:ss\""+dateTime.format(myFormat3));
		System.out.println("time in format \"hh:mm:ss\""+time.format(myFormat3));
		
		DateTimeFormatter f1= DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date1 = LocalDate.parse("01 21 2015", f1);
		LocalTime time1 = LocalTime.parse("11:22");
		System.out.println(date1); // 2015-01-21
		System.out.println(time1); // 11:22
		
		DateTimeFormatter f2= DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate date2 = LocalDate.parse("30 Jan 2018",f2);
		LocalTime time2 = LocalTime.parse("11:33");
		System.out.println(date2);
		LocalDateTime datetime2 = LocalDateTime.of(date2,time2);
		System.out.println(datetime2);
		
		DateTimeFormatter f3= DateTimeFormatter.ofPattern("dd MMM yyyy,hh:mm");	//no LocalDateTime parsing
		LocalDate datetime3 = LocalDate.parse("20 Jan 2018,11:55",f3);
		System.out.println(datetime3);
		
		
	}

}
