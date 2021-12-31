package com.hello;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAPI {

	public static void main(String[] args) {
		
		//Get the current date
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      //add 1 month to the current date
	      LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + date2);
	      
	      Period period = Period.between(date2, date1);
	      System.out.println("Period: " + period);
	}

}
