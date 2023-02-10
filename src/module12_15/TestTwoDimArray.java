package module12_15;
/*
 * 二維陣列的應用示範
 */
public class TestTwoDimArray {

	public static void main(String[] args) {
		                    // 0  1  2  3  4   
		int[][] intArray = { { 1, 2, 3, 4, 5 }, //0
				             { 6, 7, 8, 9, 10 } //1
		};
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) { //外層為小陣列的數量
			for (int j = 0; j < intArray[i].length; j++)  //代表小陣列,也就是數量
				sum += intArray[i][j];
		}
		System.out.println("總合 = " + sum);
	}

}
