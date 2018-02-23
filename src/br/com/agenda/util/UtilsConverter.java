package br.com.agenda.util;

import java.sql.Date;
import java.util.Calendar;

public class UtilsConverter {
	
	

	public Calendar dataToCalendar(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		System.out.println(calendar);
		return calendar;
	}

	
	public Date calendarToDate(Calendar calendar){
		return (Date) calendar.getTime();
	}
	
	

}
