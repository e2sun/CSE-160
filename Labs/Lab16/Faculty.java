//Evelyn Sun
//115417946
//import java.time.LocalDate;
//import java.time.LocalDateTime;

public class Faculty extends Employee {
	private String officeHours;
	private int rank;
	//LocalDate date = new LocalDateTime.now();
	//int year = date.getYear()-super.getYear();
	
	public Faculty (String n, String ad, String p, int a, String eA, double s, MyDate dH,String oH, int r) {
		super(n,ad,p,a,eA, s, dH);
		officeHours=oH;
		rank=r;
	}

	public int SalaryRange() {
		int years=2024-getDateHired().getYear();
		if (rank*years<10) {
			return 1;
		}
		else if (rank*years>=10&&rank*years<20){
			return 2;
		}
		else if (rank*years>=20) {
			return 3;
		}
		else {
			return 0;
		}
	}
	public String toString() {
		return "Faculty with name: " + super.getName();
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
