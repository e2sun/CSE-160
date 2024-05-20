//Evelyn Sun
//115417946

public class Factorial {
	public static long computeFactorial(int n) {
		long result=1;
		for (int i=n;i>0;i--) {
			result*=i;
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++) {
			System.out.println(i + "! is " + computeFactorial(i));		
			}
		

	}

}
