package module27_30;

class ClassFinalize {
	protected void finalize() {
		System.out.println("finalize方法執行了");
	}
}

public class TestFinalize {
	public static void main(String args[]) {
		ClassFinalize fin = new ClassFinalize();
		fin = null; //製造垃圾
		System.out.println("強制進行垃圾收集");
		System.gc(); //呼叫垃圾車
		//沒有在main裡面呼叫卻執行了,因為java會自己執行
	}
}
