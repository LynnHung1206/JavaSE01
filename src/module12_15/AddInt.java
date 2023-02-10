package module12_15;

public class AddInt {
                                      //不固定參數被當作陣列
	public int varArgTest(int... c) { //... 宣告可變數目的參數
		int sum = 0;

		for (int i = 0; i < c.length; i++) {
			sum += c[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		AddInt add = new AddInt();
		int sum1 = add.varArgTest(1, 2);
		int sum2 = add.varArgTest(1, 2, 3, 4);

		System.out.println("sum1=" + sum1); // 3
		System.out.println("sum2=" + sum2); // 10
	}

}