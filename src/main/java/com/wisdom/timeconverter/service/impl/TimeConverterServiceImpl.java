package com.wisdom.timeconverter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wisdom.timeconverter.manager.TimeConverterManager;
import com.wisdom.timeconverter.service.TimeConverterService;
import com.wisdom.timeconverter.validator.TimeConverterValidator;

@Component
public class TimeConverterServiceImpl implements TimeConverterService {
	
	@Autowired
	private TimeConverterValidator timeConverterValidator;

	@Autowired
	private TimeConverterManager timeConverterManager;

	@Override
	public String convert24HourTimeToWord(String time) {
		timeConverterValidator.validateTime(time);
		return timeConverterManager.convert24HourTimeToWord(time);
	}
}
