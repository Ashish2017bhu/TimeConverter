package com.wisdom.timeconverter.manager;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wisdom.timeconverter.helper.TimeConverterHelper;

@Component
public class TimeConverterManager {

	@Autowired
	private TimeConverterHelper timeConverterHelper;

	public String convert24HourTimeToWord(String time) {
		String result = "It's ";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime localTime = LocalTime.parse(time, dateTimeFormatter);
		// System.out.println("Hour: " + localTime.getHour() + ", Minute: " +
		int hour = localTime.getHour();
		int minute = localTime.getMinute();
		if (hour == 0 && minute != 0) {
			result = result + "twenty three " + timeConverterHelper.getTimeInWord(minute);
		} else if (hour != 0 && hour != 12 && minute == 0) {
			result = result + timeConverterHelper.getTimeInWord(hour);
		} else if (hour == 0 && minute == 0) {
			result = result + "Midnight";
		} else if (hour == 12 && minute == 0) {
			result = result + "Midday";
		} else {
			result = result + timeConverterHelper.getTimeInWord(hour) + " " + timeConverterHelper.getTimeInWord(minute);
		}
		return result;
	}
}
