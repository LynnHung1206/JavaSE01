package module20_23;

public class FullTimeEmployee extends Employee {  //正職員工is an Employee(繼承)
	private double monthlySalary; // 月薪   擴充項目   得到編號,名字

	public void display() {  //一般方法(Employee出現過): 方法複寫機制 
		super.display();     //父類別superclass 與父類別有關  呼叫父類別的方法
		System.out.println("月薪 = " + monthlySalary);
	}

	
	public FullTimeEmployee(int empno, String ename, double monthlySalary) {  //建構子
		                     //設定員工編號,名字(父類別已經有已經初始化過的資料)
		super(empno, ename);      //呼叫父類別的建構子,看參數個數型別決定找到哪個建構子
		this.monthlySalary = monthlySalary;
	}
}
