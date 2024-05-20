//Evelyn Sun
//115417946

import java.util.Scanner;
public class CarInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		Scanner Kc = new Scanner(System.in);
		
		System.out.print("Please enter in the premium price of the auto insurance policy: ");
		double pp = Kb.nextDouble();
		System.out.print("Please enter in the person's age: ");
		int age = Kb.nextInt();
		System.out.print("Please enter in either Male or Female for gender: ");
		String gender = Kc.nextLine();
		
		double paid = 0;
	
		if (age>=18 && age<21 && gender.equalsIgnoreCase("male")) {
			paid = 1.0;
		} else if (age>=18 && age<21 && gender.equalsIgnoreCase("female")){
			paid = 0.9; 
		}
		else if (age>=21 && age<30){
			paid = 0.75;
		}
		else if (age>=30 && age<60 && gender.equalsIgnoreCase("male")){
			paid = 0.6;
		}
		else if (age>=30 && age<60 && gender.equalsIgnoreCase("female")){
			paid = 0.7;
		}
		else if (age>=60) {
			paid = 1.0;
		}
		else {
			paid = -1;
			pp = 1;
		}
		
		System.out.println("Premium: " + (paid*pp));

	}

}
