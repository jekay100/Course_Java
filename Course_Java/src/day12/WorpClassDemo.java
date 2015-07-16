package day12;

public class WorpClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i = new Integer(1);
		System.out.println(i);//i不是基本类型了，是对象类型了对整数包装了个壳
		Long l = new Long(123L);
		String str = Long.toBinaryString(192);
		System.out.println(str);
		int a = Integer.parseInt("4e2d", 16);//很有用
		System.out.println(a);
		//输出一个字符串的每个字符的编码（hex)
		str = "我爱妈妈爸爸和全家人";//toHexString();
		for(int j = 0; j < str.length(); j++) {
			Integer.toHexString(str.charAt(j));
			//"3f" 转化int
			int x = Integer.parseInt("3f", 16);
			System.out.println(x+"dskhsfhsfhshf");
			
		}
	}
	//"abc中"转化成"abc\u4e2d"
	public static String ascII(String str) {
		//String s = "";
		StringBuilder buff = new StringBuilder();
		for (int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(c < 256) {//ascii最大255
				//s+=c;
				buff.append(c);
				
			}else{
			//	s+="\\u" + Integer.toHexString(c);
			buff.append("\\u").append(Integer.toHexString(c));
			}
		}
		return buff.toString();
	}

}
