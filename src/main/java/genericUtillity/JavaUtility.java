package genericUtillity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * This is a utilty class which has functionality from Java library
 * @author QSP
 * @version 25-12-18
 */
public class JavaUtility {
	/**
	 * This is a utility method used to fetch the calendar values.
	 * @param calendarValue
	 * @return
	 */
 public String getCalendarDetails(String calendarValue) {
	 Calendar cal = Calendar.getInstance();
	 Date date = cal.getTime();
	 SimpleDateFormat sdf = new SimpleDateFormat(calendarValue);
	 String value=sdf.format(date);
	 return value;
 }
 /**
  * This is a utility method used to fetch the random number.
  * @param boundaryValue
  * @return
  */
 public int getRandomNumber(int boundaryValue) {
	 Random r = new Random();
	int n= r.nextInt(boundaryValue);
	return n;
 }
}
