package module16_19;

public class Count2 {
	// 產品序號
	private int serialNumber;

	public int getSerialNumber() {
		return serialNumber;
	}

	// 產品數量
	private static int counter;
	static {
		counter = 0;
		System.out.println("起始數量:" + counter + "\n");  //只會讀取一次區塊
	}

	public static int getTotalCount() {
		return counter;
	}

	// 建構式
	public Count2() {
		counter++;
		serialNumber = 1000 + counter;
	}
}
