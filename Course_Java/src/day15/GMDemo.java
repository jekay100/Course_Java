package day15;
/**
 * 泛型的演示
 * @author user
 *
 */
public class GMDemo {
	public static void main(String[] args) {
		Shop<Food> foodShop = new Shop<Food>(new Food[]{new Food()});
		Food f = foodShop.buy(0);//重食品店买回来的是食品
		
	}
}
class Food{
	public String toString(){
		return "食品";
	}
}
class Pet{
	public String toString(){
		return "动物";
	}
}
//商店成了通用的商店，这个是典型的泛型，属于设计的
class Shop<P>{
	P[] products;
	public Shop(P[] products){
		this.products = products;
	}
	P buy(int i){
		return products[i];
	}
}

