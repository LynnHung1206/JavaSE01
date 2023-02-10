package module16_19;

public class PenConstructor {
	private String brand;
	private double price;
	
	public PenConstructor(String brand, double priceXXX) {
		this.brand = brand; //this後面是物件(實體變數)
		price = priceXXX;  //如果沒有同名稱變數就可以省略this
	}
	
	public static void main(String[] args) {
		PenConstructor pc = new PenConstructor("SKB", 10);
		System.out.println(pc.brand);
		System.out.println(pc.price);
	}
	
}
