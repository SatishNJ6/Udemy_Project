package java_part2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.toString()); // java default date format
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy"); // class to get required date format
		System.out.println(sdf.format(d));

		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(d));

	}

}
