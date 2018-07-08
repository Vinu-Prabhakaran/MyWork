package com.vinu.learn;

import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		Calendar cal = Calendar.getInstance();
		//cal.get(Calendar.MONTH);
		System.out.println(months[cal.get(Calendar.MONTH)]+" "+cal.get(Calendar.DAY_OF_MONTH)+" "+cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE));
	}

}
