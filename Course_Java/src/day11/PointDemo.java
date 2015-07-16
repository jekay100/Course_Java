package day11;

public class PointDemo {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		//下面两个类是一样的，不写也默认写了
		System.out.println(p);//day11.Point@1db9742。。。。
		//前面是权限定名（相当于绝路径名不会重复），@后面的是Hashcode 也是散列码，不是内存地址
		//相同地址是同一个Hashcode不同地址不一样
		System.out.println(p.toString());
		Point p1 = new Point(1,2);
		System.out.println(p == p1);//false因为p和p1全是地址，肯定不一样
		System.out.println(p.equals(p1));//false ,equals里面也是引用 == 引用,所以没用，你应覆盖
		
	}
}
