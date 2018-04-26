package WarmUp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeConversion {
	static String timeConversion(String s) {
		DateFormat df = new SimpleDateFormat("hh:mm:ssa");
		Date result = new Date();
		try {
			result = df.parse(s);
		} catch (Exception e) {
		}
		DateFormat dr = new SimpleDateFormat("HH:mm:ss", Locale.US);
		return (String) dr.format(result);
	}

	public static void main(String[] args) {
		String s = "07:05:45PM";
		String result = timeConversion(s);
		System.out.println(result);
	}
}
