package module09_11;
/*
 * 此範例為傳值傳址測試
 */
public class PassArgTest {
	                   //17行傳入的資料 double value = price;
	static void passValue(double value) {
		value = 20.0;
	}
	                   //沒有新增實體變數,只是把門牌號碼傳給方法
	static void passReference(Pen reference) {
		reference.price = 20.0;
	}
	
	public static void main(String[] args) {
		double price = 10.0;
		passValue(price);
		System.out.println(price);        // 10
		
		Pen myPen = new Pen();
		myPen.price = 10.0;
		passReference(myPen);
		System.out.println(myPen.price);  // 20
	}
}
