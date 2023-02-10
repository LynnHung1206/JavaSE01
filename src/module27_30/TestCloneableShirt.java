package module27_30;

public class TestCloneableShirt implements Cloneable { //此介面為一個空介面  貼標籤 允許物件被複製

	private char colorCode = 'U'; //unknown

	public char getColorCode() {
		return colorCode;
	}

	public void setColorCode(char newCode) {
		switch (newCode) {
		case 'R': //使用這樣可以達到||的特性
		case 'G':
		case 'B':
			colorCode = newCode;
			break;
		default:
			System.out.println("不正確的顏色碼. 請使用 R, G, or B");
		}
	}

	public static void main(String[] args) {
		TestCloneableShirt myShirt = new TestCloneableShirt();
		TestCloneableShirt yourShirt = new TestCloneableShirt();
		myShirt.setColorCode('R');
		yourShirt.setColorCode('G');
		

		System.out.println(myShirt.getColorCode()); // R
		try {
			myShirt = (TestCloneableShirt) yourShirt.clone(); //會建立新的物件 
		} catch (CloneNotSupportedException e) {
			System.out.println("不允許複製此物件!");
			e.printStackTrace();
		}
		System.out.println(myShirt.getColorCode()); // G
	}
}