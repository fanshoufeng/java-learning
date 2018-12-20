package org.fanshoufeng.datetime.local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTimeTester {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.DECEMBER, 12);
		int year = date.getYear();
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		DayOfWeek dow = date.getDayOfWeek();
		
//		LocalDate date = LocalDate.now();
//		int year = date.get(ChronoField.YEAR);
//		int month = date.get(ChronoField.MONTH_OF_YEAR);
//		int day = date.get(ChronoField.DAY_OF_MONTH);
//		int dow = date.get(ChronoField.DAY_OF_WEEK);
//		
		System.out.println("年: " + year);
		System.out.println("月: " + month);
		System.out.println("日: " + day);
		System.out.println("星期: " + dow);
		
//		LocalTime time = LocalTime.of(13, 45, 20);
//		int hour = time.getHour();
//		int minute = time.getMinute();
//		int second = time.getSecond();
		
//		LocalTime time = LocalTime.now();
//		int hour = time.get(ChronoField.HOUR_OF_DAY);
//		int minute = time.get(ChronoField.MINUTE_OF_HOUR);
//		int second = time.get(ChronoField.SECOND_OF_MINUTE);
//		
//		System.out.println("时: " + hour);
//		System.out.println("分: " + minute);
//		System.out.println("秒: " + second);
		
//		// 2018-12-12T14:55:20
//		LocalDate date = LocalDate.of(2018, Month.DECEMBER, 12);
//		LocalTime time = LocalTime.of(14, 55, 20);
//		LocalDateTime dt1 = LocalDateTime.of(2018, Month.DECEMBER, 12, 14, 55, 20);
//		LocalDateTime dt2 = LocalDateTime.of(date, time);
//		LocalDateTime dt3 = date.atTime(14, 55, 20);
//		LocalDateTime dt4 = date.atTime(time);
//		LocalDateTime dt5 = time.atDate(date);
		
//		LocalDateTime dateTime = LocalDateTime.of(2018, Month.DECEMBER, 12, 14, 55, 20);
//		LocalDate date = dateTime.toLocalDate();
//		LocalTime time = dateTime.toLocalTime();
		
//		LocalDate date1 = LocalDate.of(2018, Month.DECEMBER, 12);
//		LocalDate date2 = date1.withYear(2019);
//		LocalDate date3 = date2.withDayOfMonth(25);
//		LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 1);
		
//		LocalDate date1 = LocalDate.of(2018, Month.DECEMBER, 12);
//		LocalDate date2 = date1.plusWeeks(1);
//		LocalDate date3 = date2.minusYears(3);
//		LocalDate date4 = date3.plus(6, ChronoUnit.MONTHS);
		
//		System.out.println("date1: " + date1);
//		System.out.println("date2: " + date2);
//		System.out.println("date3: " + date3);
//		System.out.println("date4: " + date4);
		
//		LocalDate date1 = LocalDate.of(2018, Month.DECEMBER, 12);
//		LocalDate date2 = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
//		LocalDate date3 = date1.with(TemporalAdjusters.lastDayOfMonth());
		
//		System.out.println("date1: " + date1);
//		System.out.println("date2: " + date2);
//		System.out.println("date3: " + date3);
		
//		LocalDate date = LocalDate.of(2018, Month.DECEMBER, 25);
//		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
//		String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
//		System.out.println("s1: " + s1);
//		System.out.println("s2: " + s2);
		
//		LocalDate date1 = LocalDate.parse("20181225", DateTimeFormatter.BASIC_ISO_DATE);
//		LocalDate date2 = LocalDate.parse("2018-12-25", DateTimeFormatter.ISO_LOCAL_DATE);
		
	}

}
