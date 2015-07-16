package day12;

public class StringBuilderTest {

	/**
	 * @param args
	 */
	//推荐用StringBuilder连接效率高
	public static void main(String[] args) {
		long time1 = testString(100000);//字符串连接
		long time2 = testStringBuilder(100000);//
		System.out.println(time1 +"PK" +time2);
	}
	public static long testString(int times){
		long start = System.currentTimeMillis();
		String s = "";
		for(int i = 0; i < times; i++) {
			s+="A";
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long testStringBuilder(int times){
		long start = System.currentTimeMillis();
		StringBuilder s = new StringBuilder(times);//扩展
		for(int i = 0; i < times; i++) {
			s.append("A");
		}
		String b = s.toString();
		long end = System.currentTimeMillis();
		return end-start;
	}

}
