package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar clr = Calendar.getInstance();
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(s.format(clr.getTime()));
		System.out.println(clr.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(clr.get(Calendar.DAY_OF_WEEK));
	}

}
