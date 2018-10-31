package br.com.gym.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatValues {

	public int stringToInt(String str) {
		str = str.trim();
		str = str.replaceAll("[^\\d.]", "");
		int number = Integer.parseInt(str);
		return number;
	}
	
	public long stringToTime(String str) {
		str = str.trim();
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss.SSS");
		Date date = null;
		long millis = 0;
		try {
			date = sdf.parse(str);
			int smin = date.getMinutes()*60;
			int ssec = date.getSeconds();
			millis = smin+ssec;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return millis;
	}

	public double stringToDouble(String str) {
		str = str.trim();
		str = str.replaceAll("[^\\d.]", "");
		double number = Double.parseDouble(str);
		return number;
	}
	
}
