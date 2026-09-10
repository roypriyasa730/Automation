package testngScripts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args ) {
		Calendar c= Calendar.getInstance();
		Date d= c.getTime();
		System.out.println(d);	
		SimpleDateFormat Sdf=new SimpleDateFormat("hh-mm-ss dd-mm-yyy");
		String dateandtime = Sdf.format(d);
		System.out.print(dateandtime);
	}
public String getDateAndTime() {
	Calendar c= Calendar.getInstance();
	Date d= c.getTime();
	SimpleDateFormat Sdf=new SimpleDateFormat("hh-mm-ss dd-mm-yyy");
	String dateandtime = Sdf.format(d);
	return dateandtime;
	
}
}

