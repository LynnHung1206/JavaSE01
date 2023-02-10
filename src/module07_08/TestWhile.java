package module07_08;
/*
 * 此範例為while迴圈測試
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 100;  //前面找一個位置設置breakpoint
		

		while (i <= 10) {  //條件不成立,ignore
			System.out.println(i);
			i++;
		}

		System.out.println("------------------------------");

		int count = 1;
		while (count++ < 5)
			System.out.println("count = " + count); //只有一敘述省略{}
	}

}
