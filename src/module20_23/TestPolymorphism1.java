package module20_23;

public class TestPolymorphism1 {

	public static void main(String[] args) {
		EmployeePoly e1 = new FullTimeEmployeePoly(7002, "David", 50000.0); // 各種身分都當做員工
		EmployeePoly e2 = new ManagerPoly(7003, "James", 50000.0, 10000.0);
		EmployeePoly e3 = new PartTimeEmployeePoly(7004, "Vincent", 1000.0, 8);

//		FullTimeEmployeePoly f = (FullTimeEmployeePoly) e1; // Type casting
//		ManagerPoly m = (ManagerPoly) e1;   //轉型失敗        // 執行時期:java.lang.ClassCastException
//		PartTimeEmployeePoly p = (PartTimeEmployeePoly) e1; // 執行時期:java.lang.ClassCastException

//		System.out.println(e1 == f);  //身分不同的變數,但代表同一個東西
//		System.out.println("轉型成功");
		
		System.out.println(e1 instanceof FullTimeEmployeePoly); // true
		System.out.println(e1 instanceof ManagerPoly); // false
		System.out.println(e1 instanceof PartTimeEmployeePoly); // false
		
		System.out.println(e2 instanceof FullTimeEmployeePoly); // true
		System.out.println(e2 instanceof ManagerPoly); // true
		System.out.println(e2 instanceof PartTimeEmployeePoly); // false
	}

}
