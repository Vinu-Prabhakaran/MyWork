/**
 * 
 */
package com.vinu.ocpchap5;

/**
 * @author Vinu Prabhakaran
 *         on Jul 18, 2021
 *
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class FormatDateAndTime {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(date.getDayOfWeek()); // MONDAY
		System.out.println(date.getMonth()); // JANUARY
		System.out.println(date.getYear()); // 2020
		System.out.println(date.getDayOfYear()); // 20
		
		System.out.println("*** DateTimeFormatter ***");
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter longF = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

		System.out.println(shortF.format(date));
		System.out.println(date.format(mediumF));
		System.out.println(date.format(longF));
		
		System.out.println("*** Format using pattern ***");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(f.format(dateTime));
		System.out.println(f.format(time));
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("H:mm MMM-DD-yyyy");
		System.out.println(f2.format(dateTime));
		
		System.out.println("*** Parse String using pattern ***");
		System.out.println(LocalDateTime.parse("13:44 Jan-25-1984",f2));
		System.out.println(LocalDate.parse("13:44 Jan-25-1984",f2));
		System.out.println(LocalTime.parse("13:44 Jan-25-1984",f2));

	}
}
