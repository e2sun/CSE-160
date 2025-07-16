//Evelyn Sun
//115417946

public class Employee extends Person {
	private double salary;
	private MyDate dateHired;
	
	
	
	public Employee (String n, String ad, String p, int a, String eA, double s, MyDate dH) {
		super(n,ad,p,a,eA);
		salary=s;
		dateHired=dH;
	}
	public MyDate getDateHired() {
		return dateHired;
	}
	public String toString() {
		return "Employee with name: " + super.getName();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
