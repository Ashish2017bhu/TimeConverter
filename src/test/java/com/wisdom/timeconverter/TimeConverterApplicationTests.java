package com.wisdom.timeconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wisdom.timeconverter.service.TimeConverterService;

@SpringBootTest
class TimeConverterApplicationTests {

	@Autowired
	private TimeConverterService timeConverterService;

	@Test
	public void timeConversionTest_IfMidday() {
		String time = "12:00";
		String result = timeConverterService.convert24HourTimeToWord(time);
		assertEquals("It's Midday", result);
	}

	@Test
	public void timeConversionTest_IfMidnight() {
		String time = "00:00";
		String result = timeConverterService.convert24HourTimeToWord(time);
		assertEquals("It's Midnight", result);
	}

	@Test
	public void timeConversionTest_IfEightThirtyFour() {
		String time = "08:34";
		String result = timeConverterService.convert24HourTimeToWord(time);
		assertEquals("It's eight thirty four", result);
	}

	@Test
	public void timeConversionTest_IfInvalidTimePassed() {
		String time = "25:34";
		RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
			timeConverterService.convert24HourTimeToWord(time);
		});
		assertEquals("Invalid time passed", thrown.getMessage());

	}

}
