package module20_23;

public class Employee {  //有所有java共同的父類別object
	private int empno;   //員工編號 名字
	private String ename;

	public void setEmpno(int empno) {  //一般方法會被繼承
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

	public Employee(int empno, String ename) {  //建構子1(不會被繼承)
		super(); //java會自動加上,要寫不寫都可以,因為要符合父類別建構子放在第一個敘述位置
		this.empno = empno;
		this.ename = ename;
	}

	public Employee(int empno) {                //建構子2 overloading
//		super();  //因為會去呼叫其他建構子,寫上會再跑一次父類別建構子,不符合規範
		          //因為建構子是程式進行時第一行執行
		this(empno, "-");  //this() 呼叫其他建構子  要放在第一個位置!!!!
	}

	public Employee(String ename) {             //建構子3
		this(0, ename);
	}

	public Employee() {                         //建構子4
	}

	public void display() {
		System.out.println("empno = " + empno);
		System.out.println("ename = " + ename);
	}
}
