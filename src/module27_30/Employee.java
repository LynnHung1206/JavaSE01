package module27_30;

public class Employee {
	private int empno;
	private String ename;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public Employee(int empno) {
		this(empno, "-");
	}

	public Employee(String ename) {
		this(0, ename);
	}

	public Employee() {
		this(0, "-"); 
	}

	public void display() {
		System.out.println("empno=" + empno);
		System.out.println("ename=" + ename);
	}

	public boolean equals(Object obj) {  //參數型別要與父類別一致
		// 仍要使用==來判斷，因為(也許)要比較的"物件參考變數"，其實指的是同一個實體(指向同一個記憶體空間)
		if (this == obj)  //速度最快,如果位置一樣後面就不用做了
			return true;
		// 用(Object類別的)getClass()來確定是否隸屬於同一個class的物件
		if (obj != null && this.getClass() == obj.getClass()) {  //null沒有門牌號碼沒得比
			if (obj instanceof Employee) {  //obj轉型成Employee才可以存取的到相關的項目
				// 為了讓物件可傳入進來, 所以先晉升成Object型別, 但Object型別會存取不到empno/ename, 所以要再把型別轉回成Employee
				Employee e = (Employee) obj;
				// 選擇該類別的必要成員變數(實體變數)來加以判斷是否有相等(相同)
				if (empno == e.empno && ename.equals(e.ename)) {
					return true;
				}
			}
		}
		return false;
	}

//	public int hashCode() {
//		// 借用一下 String 類別現有的hashCode運算法則
//		return this.ename.hashCode(); 
//		// 或借用一下 Integer類別現有的hashCode運算法則
//		// return new Integer(this.empno).hashCode(); 
//	}
}
