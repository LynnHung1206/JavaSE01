package module16_19;

/*
 * 此範例為多載建構子示範
 * 可以透過this關鍵字呼叫當前物件與其它建構子
 */
public class PenConstOverload {
	private String brand;
	private double price;

	public PenConstOverload(String brand, double price) { // 建構子
		this.brand = brand;
		this.price = price;
	}

	public PenConstOverload(double price) { // 建構子 p2對應  
		this("SKB", price);  //會去第一個建構子找資料(對應2筆)
	}

	public PenConstOverload(String brand) { // 建構子
		this(brand, 10);     //會去第一個建構子找資料(對應2筆)
		                     //設計者自行設定預設值 
	}

	public PenConstOverload() { // 建構子
		this("SKB", 10);    //會去第一個建構子找資料(對應2筆)  類別裡面有2個以上建構子才會用this
	}

	public void showInfo() {
		System.out.println("牌子為： " + brand);
		System.out.println("價格為： " + price);
		System.out.println("=============");
	}

	public static void main(String[] args) {

		PenConstOverload p1 = new PenConstOverload("A", 20);
		PenConstOverload p2 = new PenConstOverload(40);
		PenConstOverload p3 = new PenConstOverload("B");
		PenConstOverload p4 = new PenConstOverload();

		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		p4.showInfo();
	}
}
