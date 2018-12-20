package org.fanshoufeng.datetime.zoned;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTester {

	public static void main(String[] args) {
		//地区ID都为“{区域}/城市”的格式
		ZoneId shanghaiZone = ZoneId.of("Asia/Shanghai");
		
		//为时间点添加时区信息
		LocalDate date = LocalDate.of(2018, Month.DECEMBER, 12);
		ZonedDateTime zdt1 = date.atStartOfDay(shanghaiZone);
		
		LocalDateTime dateTime = LocalDateTime.of(2018, Month.DECEMBER, 12, 14, 55, 20);
		ZonedDateTime zdt2 = dateTime.atZone(shanghaiZone);
		
		System.out.println("zdt1: " + zdt1);
		System.out.println("zdt2: " + zdt2);
	}

}
