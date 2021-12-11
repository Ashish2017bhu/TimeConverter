package com.wisdom.timeconverter.validator;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class TimeConverterValidator {

	public void validateTime(String time) {
		try {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
			LocalTime.parse(time, dateTimeFormatter);
		} catch (Exception e) {
			throw new RuntimeException("Invalid time passed");
		}
		
	}
	
	
}
