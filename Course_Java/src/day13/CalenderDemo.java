package day13;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import  java.util.Date;
import  java.text.DateFormat;
import java.util.GregorianCalendar;
public class CalenderDemo {


	public static void main(String[] args) 
			throws Exception {
		String str = "2013-11-22";
		DateFormat  df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(str);
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal = spiecalDay(cal, 1);
		date = cal.getTime();
		String s = df.format(date);
		System.out.println(date);
	}
	public static Calendar spiecalDay(Calendar creat, int expMonths) {
		//生产日期知道一定要算到期日期
		//Calendar cal = creat;最后把calendar的值改了，不好
		Calendar cal = new GregorianCalendar();
		cal.setTime(creat.getTime());
		//生产日期上加上，保质期的月分，计算过期时间
		cal.add(Calendar.MONTH, expMonths);
//		long l = System.currentTimeMillis();
//		l+=1000*60*60*24;//毫秒数加起来过期的那个底层就是这个，
		cal.add(Calendar.WEEK_OF_MONTH, -2);//年中的两周和月中的两周一样
		//设置当前周的周日
		cal.set(Calendar.DAY_OF_WEEK, 0);
		
				
		return cal;
	}

}
