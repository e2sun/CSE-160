//Evelyn Sun
//115417946

public class Student extends Person {
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
			
	private String classStatus;
	
	public Student (String n, String ad, String p, int a, String eA, String cS) {
		super(n,ad,p,a,eA);
		classStatus=cS;
	}
	
	
	public String toString() {
		return "Student with name: " + super.getName();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
