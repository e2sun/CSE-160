//Evelyn Sun
//115417946
import java.util.Scanner;


public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		int upper = Kb.nextInt();
		System.out.print("The perfect numbers below " + upper + " are: ");
		
		//int total = 0;
		for (int i=1; i<upper; i++) {
			int total = 0;
			for (int j = 2; j<=i;j++) {
				if (i%j==0) {
					total += i/j;
										
				}
			}
				
			if (total==i) {
					System.out.print(i + " ");
			}
			
		}
	}
}
			

			
			
		
		

	



