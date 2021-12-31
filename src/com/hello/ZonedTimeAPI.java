package com.hello;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTimeAPI {
	public static void main(String[] args) {
	
		//create a ZonedDateTime object
		//using of method
		ZonedDateTime zoned = ZonedDateTime.of(2020, 12, 31, 12, 23, 0, 0, ZoneId.systemDefault());
		
		System.out.println("ZonedDateTime :"+zoned);
		
		//create a LocalDateTime
		LocalDateTime local = LocalDateTime.parse("2021-12-31T23:03:50");
		
		//create a ZoneId
		ZoneId zid = ZoneId.of("Europe/Paris");
		
		//create an ZoneDateTime Object using of()
		ZonedDateTime z = ZonedDateTime.of(local, zid);
		
		System.out.println("ZonedDateTime :"+z);

	}
}
