package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateOperations {
	
	public static void main(String[] args) {
		
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String format = LocalDate.now().format(ofPattern);
		System.out.println(format);
		
		DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("MMM-YYYY-dd");
		
		String format2 = LocalDate.now().format(ofPattern2);
		System.out.println(format2);
		
	}

	private static void localDateTime() {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		
		LocalDateTime localDateTime = LocalDateTime.of(2026,9,2,10,0,0);
		System.out.println(localDateTime);
		
		System.out.println(localDateTime.getHour());
	}

	private static void localDates() {
		LocalDate now = LocalDate.now();
		
		System.out.println(now);
		
		LocalDate of = LocalDate.of(2026, 8, 31);
		System.out.println(of);
		
		LocalDate date = LocalDate.parse("2026-09-02");
		System.out.println(date);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		
		System.out.println(date.isLeapYear());
		System.out.println(date.lengthOfMonth());
		
		System.out.println(date.plusDays(2));
		System.out.println(date.minusDays(5));
		System.out.println(date.plusMonths(1));
		System.out.println(date.minusMonths(1));
		
		// 50th day
		LocalDate date2 = LocalDate.of(2024, 1, 1);
		System.out.println(date2.withDayOfYear(60));
		
		// JFS
		LocalDate validTill = LocalDate.of(2028, 6, 1);
		
		System.out.println(LocalDate.now().isBefore(validTill));
	}

}
