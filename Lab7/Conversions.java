//Evelyn Sun
//115417946

import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
			Scanner Kb = new Scanner(System.in);
			Scanner Kc = new Scanner(System.in);
			System.out.println("A - convert pounds to kilos");
			System.out.println("B - convert kilos to pounds");
			System.out.println("C - convert kilometers to miles");
			System.out.println("D - convert miles to kilometers");
			System.out.println("E - convert Celsius to Fahrenheit");
			System.out.println("F - convert Fahrenheit to Celsius");
			System.out.println("G - Exit");
		
			System.out.print("Enter your option: ");
			String option = Kb.nextLine();
		
			if (option.equalsIgnoreCase("A")) {
				System.out.print("Enter a quantity in pounds: ");
				double pounds = Kc.nextDouble();
				double kilos = pounds * 0.453592;
				System.out.println(pounds + " pounds is " + kilos + " kgs");
			}
			else if (option.equalsIgnoreCase("B")) {
				System.out.print("Enter a quantity in kgs: ");
				double kilos = Kc.nextDouble();
				double pounds = kilos/0.453592;
				System.out.println(kilos + " kgs is " + pounds + " pounds");	
			}
			else if (option.equalsIgnoreCase("C")) {
				System.out.print("Enter a quantity in km: ");
				double km = Kc.nextDouble();
				double miles  = km * 0.621371;
				System.out.println(km + " km is " + miles + " miles");	
			}
			else if (option.equalsIgnoreCase("D")) {
				System.out.print("Enter a quantity in miles: ");
				double miles = Kc.nextDouble();
				double km  = miles/0.621371;
				System.out.println(miles + " miles is " + km + " km");	
			}
			else if (option.equalsIgnoreCase("E")) {
				System.out.print("Enter a quantity in Celsius: ");
				double c = Kc.nextDouble();
				double f  = c*1.8 + 32;
				System.out.println(c + " degrees Celsius is " + f + " degrees Fahrenheit");
			}
			else if (option.equalsIgnoreCase("F")) {
				System.out.print("Enter a quantity in Fahrenheit: ");
				double f = Kc.nextDouble();
				double c  = (f-32) * (5/9);
				System.out.println(f + " degrees Fahrenheit is " + c + " degrees Celsius");
			}
			else if (option.equalsIgnoreCase("G")) {
				System.out.print("Goodbye!");
				break;
			}
			
	
		

		}
	}

}
