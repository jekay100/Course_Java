package day18;

public class FileEncodingDemo {
	//看老师的代码
	public static void main(String[] args){
		//可以得出中文2个byte,英文1个byte，变长编码 ，GBK,英文编码和ascii一样 
		//UTF16-BE是Java的内码，是16位定长编码 编码值是Unicode的标准Java中就是Unicode编码
		//UTF-8是变长编码 ，中文是3个编码，英文是1个byte
		//大多数网页用UTF-8在网页中用的最多的是控制制符，英文的标记多，用UTF-8是节省内存
		//UTF-8也是Unicode编码的把16的前面删除了，就是一样的，（1110）表示前面三个byte是一个字
		//后面以10开头的表示数据，把这些东西去了，就是Unicode，用的标准不一样
		//UTF-8实现了unicode
		//需要注意的是，Unicode只是一个符号集，它只规定了符号的二进制代码，却没有规定这个二进制代码应该如何存储。
		//Unicode怎么想个接口，没有规定怎么存储的，unicode是规定了全世界所有文字的二进制怎么编码 
		//new String(buf, "GBK");这个构造器有所有的编码，对应转化用Java做Java里面有个大Map,相当于个字典，可以查出来，再显示	
		//由上可知文本文件是有编码的，要不就会出现乱码的，Java能通过字符串类，getBytes(“GBK”),new String();对编码自动输出，不用人工查
		//Java默认按照本地平台处理编码windows默认是GBK（文本下编辑）在另一台windows下打开不会出错，linux编码GBK2312是GBK的子集，有可能打开就出错了
		//喆在linux下的eclipse不让保存，因为GBK2312没有，所以eclipse没有找到编码，不让保存
		//写出write("中国吧".getBytes());按默认编码保存，
		String s = new String("skks");//没有第二个参数，默认是按照本地编码 处理
		//用前面学的从硬盘Read()读取，打出来还要考虑编码问题了，
		//Java提供了一个默认的类，自己处理编码
		
		
	}

}
