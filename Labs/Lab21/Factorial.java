//Evelyn Sun
//115417946
public class Factorial {
	public static long computeFactorial(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n*computeFactorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++) {
			System.out.println(i + "! is " + computeFactorial(i));		
			}

	}

}
