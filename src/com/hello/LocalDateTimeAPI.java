package com.hello;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeAPI {
	public static void main(String[] args) {
		
		//Get the current time and date
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime is :"+currentTime);
		
		//Get only date
		LocalDate date = currentTime.toLocalDate();
		System.out.println("The Date is :"+date);
		
		//Get current month ,day , seconds
		  Month month = currentTime.getMonth();
	      int day = currentTime.getDayOfMonth();
	      int seconds = currentTime.getSecond();	
	      System.out.println("Month: " + month +" " +"day: " + day +" " +"seconds: " + seconds);
	     
	    //Parse a String
	      LocalTime stringTime = LocalTime.parse("20:01:30");
	      System.out.println("The Conversion of String is:"+stringTime);		
	}
}
