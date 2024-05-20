//Evelyn Sun
//115417946

public class HourlyEmployee extends Employee {
	private double hours;
	private double wage;
	
	public HourlyEmployee(String name, String ID, double hours, double wage) {
		super(name, ID);
		this.hours=hours;
		this.wage=wage;
	}
	public double earnings() {
		return hours*wage;
	}
	public String toString() {
		return super.toString() + "\n" + "Earnings: " + earnings();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourlyEmployee A = new HourlyEmployee("John", "123",40,15);
		System.out.println(A);

	}

}
