//Evelyn Sun
//115417946


public class AckermannFunction {
	public static int ackermann(int m, int n) {
		if (m==0) {
			return n+1;
		}
		else if (n==0) {
			return ackermann(m-1,1);
		}
		else {
			return ackermann(m-1,ackermann(m,n-1));
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ackermann(0,3):" + ackermann(0,3) );
		System.out.println("ackermann(3,0):" + ackermann(3,0) );
		System.out.println("ackermann(2,2):" + ackermann(2,2) );
		System.out.println("ackermann(3,3):" + ackermann(3,3) );
		

	}

}
