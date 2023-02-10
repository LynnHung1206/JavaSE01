package module24_26;

// 筆類別(父類別)
// 抽象類別  無法產生(new)物件
//一個java檔最多只有一個公開類別 = 檔名
//如果全部都default是可以的
//不能搭配final使用(不能被繼承沒有意義)
//可以使用建構子
abstract class Pen {    //default,abstract
	protected String brand;  //同個套件下的其他類別和子類別(protected)
	protected double price;  //改成private就無法使用

	// 抽象方法
	public abstract void write();

	public void setdata(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
}

// 自訂的筆類別(子類別)
class MyPen extends Pen {  //default
	// 定義抽象類別的動作
	public void write() {
		System.out.print("牌子是： " + brand);
		System.out.println("價格為： " + price);
	}
}

public class TestAbstract {  //public
	public static void main(String args[]) {
		MyPen myPen = new MyPen(); //MyPen也可以是一種Pen Pen myPen = new MyPen();
		myPen.setdata("SKB", 10);  //抽象類別作為父類別也可以拿來宣告新的物件
		myPen.write();
	}
}
