//Evelyn Sun
//115417946


public class Staff extends Employee {
	private String title;
	
	public Staff(String n, String ad, String p, int a, String eA, double s, MyDate dH, String t) {
		super(n,ad,p,a,eA, s, dH);
		title=t;
	}
	
	public String toString() {
		return "Staff with name: " + super.getName();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
