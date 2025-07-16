//Evelyn Sun
//115417946

public class SequenceSum {
	public static double seqSum(int i) {
		if (i==1) {
			return 1;
		}
		else {
			return 1.0/i+seqSum(i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++) {
			System.out.println(i+ ": " + seqSum(i));
		}
	}

}
