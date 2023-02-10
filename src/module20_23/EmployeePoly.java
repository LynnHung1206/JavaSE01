package module20_23;

public abstract class EmployeePoly { //只要有抽象方法的類別一定要宣告為抽象類別
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

	public EmployeePoly(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public EmployeePoly(int empno) {
		this(empno, "-");
	}

	public EmployeePoly(String ename) {
		this(0, ename);
	}

	public EmployeePoly() {
		this(0, "-"); // 或 empno = 0; ename = "-";
	}

	public void display() {
		System.out.println("empno=" + empno);
		System.out.println("ename=" + ename);
	}

	// 新增getSalary方法
//	public double getSalary(){ //在父類別定義一個方法,讓子類別依需求可以做override
//		return 0;  //不應該在程式裡面存在意義不明的東西
//	}
	public abstract double getSalary();  //宣告抽象方法
}
