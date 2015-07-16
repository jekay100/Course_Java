package day13;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import  java.util.Date;
import java.util.GregorianCalendar;
public class DateFormatDemo {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		//定义个日期格式化类 工具 
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = fmt.format(date);
		System.out.println(str);
		String stri = "1970-1-1";
		DateFormat dat = new SimpleDateFormat("yyyy-MM-dd");
		Date da = dat.parse(stri);//全是按Date输出的全要转成Date
		System.out.println(dat.format(da));
		Calendar  ca = new GregorianCalendar();
		//DateFormatUtils.formart
		
		
	}

}
