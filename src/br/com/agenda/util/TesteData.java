package br.com.agenda.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar c = Calendar.getInstance();
		
		
		c.set(Calendar.YEAR, 2018);
		c.set( Calendar.MONTH, Calendar.MONTH);
		c.set(Calendar.DAY_OF_MONTH, 20);
		//System.out.println("Hoje é :"+c.get(Calendar.DAY_OF_MONTH)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
		
		Date data = c.getTime();
		
		
		
		Date d1 = new Date();
		
		
		System.out.println(d1);
		
		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Formatada: "+ formataData.format(d1));
		
		
	}

}
