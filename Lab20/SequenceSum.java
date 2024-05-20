//Evelyn Sun
//115417946

public class SequenceSum {
	public static double m(int i) {
		double m =0;
		for (double j=1; j<=i;j++) {
			m+=(1.0/j);
			
		}
		return m;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++) {
			System.out.println("m(" + i + "): " + m(i));
		}
	

	}

}
