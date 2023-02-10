package module16_19;

public class Count {
	// 產品序號
	private int serialNumber; //實體變數

	public int getSerialNumber() {
		
		return serialNumber;
	}

	// 產品數量
	private static int counter; //類別變數和實體變數一樣都有預設初始值

	public static int getTotalCount() {
		return counter;
	}

	// 建構式
	public Count() {
		counter++;
		serialNumber = 1000 + counter;
	}
}
