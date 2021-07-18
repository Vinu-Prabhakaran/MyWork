/**
 * 
 */
package com.vinu.ocpchap5;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * @author Vinu Prabhakaran
 *         on Jul 17, 2021
 *
 */
public class CreateDateTime {
	
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		LocalDate myBd = LocalDate.of(1984, Month.MAY, 20);
		LocalDate mummysBd = LocalDate.of(2012, Month.AUGUST, 20);

		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldtOld = ldt.minusDays(10).minusHours(15);
		ZonedDateTime indiaZdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Kolkata"));
		System.out.println("LocalDate"+ld);
		System.out.println("LocalTime"+lt);
		System.out.println("LocalDateTime"+ldt);
		System.out.println("LocalDateTime Old"+ldtOld);
		System.out.println("Available ZoneIds :"+ ZoneId.getAvailableZoneIds());
		System.out.println("ZonedDateTime"+indiaZdt);
		
		
		System.out.println("Date after 10 days :"+ ldt.plusDays(10));
		System.out.println("Date before 10 days :"+ ldt.minusDays(10));
		
		System.out.println("Date after 10 days 5 hours 3 minutes 10 seconds 100 nanos:"+ 
				ldt.plusDays(10)
			       .plusHours(5)
			       .plusMinutes(3)
			       .plusSeconds(10)
			       .plusNanos(100));
		
		System.out.println("Period Since my Bd :"+ Period.between(ld, myBd));
		System.out.println("Period Since mummys Bd :"+ Period.between(ld, mummysBd));

		Period p=Period.of(10, 5, 20);
		System.out.println("Date after 10 yrs 5 months 10 days :"+ldt.plus(p));
		
		Duration d=Duration.ofDays(10);
		System.out.println("Duration added :"+ldt.plus(d));
		
		System.out.println("Duration since ldt Old :"+Duration.between(lt, ldtOld));
		
		System.out.println("Days between ldt and ldt Old :"+ChronoUnit.DAYS.between(ldt, ldtOld));
		System.out.println("Hours between ldt and ldt Old :"+ChronoUnit.HOURS.between(ldt, ldtOld));
		
		//The Instant class represents a specific moment in time in the GMT time zone
		System.out.println("Instant.now() :"+Instant.now());
		Instant now = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		Instant later = Instant.now();
 		System.out.println("Duration between instances :"+ Duration.between(now, later));
 		System.out.println("GMT Corresponding to "+indiaZdt+" :"+Instant.from(indiaZdt));
 		
 		Instant nextDay = now.plus(1, ChronoUnit.DAYS);
 		System.out.println(nextDay); 
 		Instant nextHour = now.plus(1, ChronoUnit.HOURS);
 		System.out.println(nextHour); 


		
	}
}
