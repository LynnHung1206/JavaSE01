package module20_23;

public class ManagerPoly extends FullTimeEmployeePoly {
	private double bonus; // 獎金; 額外津貼; 特別補助

	public void display() {
		super.display();
		System.out.println("額外津貼=" + bonus);
	}

	public ManagerPoly(int empno, String ename, double monthlySalary, double bonus) {
		super(empno, ename, monthlySalary);
		this.bonus = bonus;
	}

	// add
	public double getSalary() {
		double monthlySalary = super.getSalary();  //呼叫父類別
		return monthlySalary + bonus;
//		return super.getSalary(); + bonus; //也可以這樣寫
		
	}
}
