package module24_26;

//宣告介面
interface Display {
	// 宣告變數(常數) , 修飾子如同 public static final(自動加上)
	int num1 = 100;
	int num2 = 10;

	// 宣告方法(抽象方法) , 修飾子如同 public abstract
	void disp();  //介面裡面的方法強制為抽象方法,會自動加上public abstract
	              //介面一定是公開的抽象方法
}

// 實作介面
class Plus implements Display {  //資料是在display介面已經宣告
	public void disp() {
		System.out.print(num1 + " + " + num2 + " = ");  //常數無法被修改
		System.out.println(num1 + num2);
	}
}

// 實作介面
class Minus implements Display {
	public void disp() {
		System.out.print(num1 + " - " + num2 + " = ");
		System.out.println(num1 - num2);
	}
}

public class TestInterface {
	public static void main(String args[]) {
//		Plus p1 = new Plus(); //沒有共同的父類別可以一起操作,所以個別操作
//		p1.disp();            //只有object共通,但object裡面沒有這個方法 
//		Minus m1 = new Minus();
//		m1.disp();
		
		Display p1 = new Plus();//可以用介面宣告
		Display m1 = new Minus();
		
	}
}
