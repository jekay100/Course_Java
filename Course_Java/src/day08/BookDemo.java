package day08;

public class BookDemo {
	public static void main(String[] args) {
		Book book = new Book(); // Book是类（类型）book是变量，必须初始化
		// new Book（）就是初始化，把对像的引用给了book
		// book就引用了对像
		// book是引用，new Book()是对像通过引用和对象之间建立联系（=）
		// 变量默认是空的，new一个类型就是建立了一个对象
		book.name = "山渣树之恋";
		System.out.println(book.name);
		System.out.println(book.subject);// null
		book = new Book();
		System.out.println(book.name);
		// 上面是两个对象的引用，也就是一个引用
		book = null;
		// System.out.println(book.name);空指针异常，没有关联书已经卖完了
	}
}
