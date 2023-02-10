package module20_23;

public class Manager extends FullTimeEmployee {
	private double bonus; // 獎金; 額外津貼; 特別補助    得到編號,名字,月薪

	public void display() {  //為了要明確,針對上一層做改寫(不能跳層)
		super.display();     //呼叫父類別的方法
		System.out.println("額外津貼 = " + bonus);
	}

	public Manager(int empno, String ename, double monthlySalary, double bonus) {
		super(empno, ename, monthlySalary); 
		this.bonus = bonus;
		
	}
}
