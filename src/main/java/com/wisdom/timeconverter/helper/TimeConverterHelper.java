package com.wisdom.timeconverter.helper;

import org.springframework.stereotype.Component;

@Component
public class TimeConverterHelper {

	public String getTimeInWord(int time) {
		String word[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sisteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine", "thirty", "thirty one", "thirty two", "thirty three",
				"thirty four", "thirty five", "thirty six", "thirty seven", "thirty eight", "thirty nine", "fourty",
				"fourty one", "fourty two", "fourty three", "fourty four", "fourty five", "fourty six", "fourty seven",
				"fourty eight", "fourty nine", "fifty", "fifty one", "fifty two", "fifty three", "fifty four",
				"fifty five", "fifty six", "fifty seven", "fifty eight", "fifty nine" };
		
		return word[time];
	}
}
