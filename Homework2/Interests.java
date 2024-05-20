//Evelyn Sun
//115417946


import java.util.Scanner;
public class Interests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Loan amount: ");
		double loan = Kb.nextDouble();
		System.out.print("Number of years: ");
		int years = Kb.nextInt();
		
		System.out.println("Interest Rate \t  Monthly Payment \t Total Payment" );
		for (double i =5; i<8;i=i+0.125) {
			double annualInterestRate = i;
			double monthlyInterestRate = annualInterestRate/1200;
			double monthlyPayment = loan * monthlyInterestRate/(1-(Math.pow(1/(1+monthlyInterestRate), years*12)));
			double totalPayment = monthlyPayment * years * 12;
			System.out.printf("%.3f%% \t \t %.2f \t \t %.2f \n", annualInterestRate, monthlyPayment, totalPayment);
		}
		
	
		
	}

}
