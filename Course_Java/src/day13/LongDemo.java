package day13;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class LongDemo {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		int year = 1970 +(int)(now /1000/60/60/24/365);
		System.out.println(year);
		
		Date date = new Date(now);//Date里面是long
		System.out.println(date.getYear() + 1900);//114,2000年以后数字就错了，sun所以就不tuijian的
		//1900+114;
		System.out.println(date.getMonth());//11这个是对的
		Date d = new Date(0);
		System.out.println(d.getYear() + 1900);//前面省略了19
		System.out.println(d.getMonth());
		System.out.println(d.getDay()+"skkdjfkdfjk");
		//Calendar历法，记载时间 的方法，就是立法
		//传统农历按月亮记载时间的初一没有月亮，15月圆，满月到，公历是按太阳，转一圈，
		//因为地球也自转，所以不同步，最后就闰出一个月了，
		//所以历法是抽象类，因为有不同的方法，有农历，公历，实现类有很多
		//Java中的历法 
		//GregorianCalendar代表的公历，公无纪年
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		year = cal.get(Calendar.YEAR);//获取日历中年份这个字段的值
		int month = cal.get(Calendar.MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(year + "年" + month + "月" +hour);
	} 

}
