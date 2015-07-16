package day12;

public class RegDemo {
	public static void main(String[] args) {
		String email = "liuyufeng1314521@live.com";
		//email:^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)*$;
		//Java字符串要变成两个
		String reg = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*$";
		String reg1 = "^\\d{15}(\\d{2}[\\dxX])*";
		String shenfen = "141125199209290033";
		boolean passs = shenfen.matches(reg1);
		boolean pass = email.matches(reg);//email和正则表达式屁配
		System.out.println(pass);
		System.out.println(passs);
		
		String date = "2014年12月11日";
		date = date.replace("日", "").replaceAll("[年月]","-");
		System.out.println(date);
	}
}
