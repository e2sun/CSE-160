
//Evelyn Sun
//`115417946

import java.util.Scanner;


public class ChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner (System.in);
		System.out.print("Enter price $");
		double price = Kb.nextDouble();
		System.out.print("Enter the amount: $");
		double amount = Kb.nextDouble();
		double change = amount - price;
		System.out.println("Change: $" + change);
		int cents = (int)(change*100); //$100
		int hundreds = cents/10000;
		if (hundreds!=0) {
			System.out.print(hundreds + " x $100");
		}
		cents = cents%10000;
		int fifty = cents/5000;
		if (fifty!=0) {
			System.out.println(fifty + " x $50");
		}
		cents = cents%5000;
		int twenty = cents/2000;
		if (twenty!=0) {
			System.out.println(twenty + " x $20");
		}
		cents = cents % 2000;
		int tens = cents/1000;
		if (tens!=0) {
			System.out.println(tens + " x $10");
		}
		cents = cents%1000;
		int fives = cents/500;
		if (fives!=0) {
			System.out.println (fives + " x $5");
		}
		cents = cents%500;
		int ones = cents/100;
		if (ones!=0) {
			System.out.println(ones + " x $1");
		}
		cents = cents%100;
		int qs = cents/25;
		if (qs!=0) {
			System.out.println(qs + " x 25c");
		}
		cents = cents%25;
		int ds = cents/10;
		if (ds!=0) {
			System.out.println(ds + " x 10c");
		}
		cents = cents%10;
		int ns = cents/5;
		if (ns!=0) {
			System.out.println(ns + " x 5c");
		}
		cents = cents%5;
		if (cents!=0) {
			System.out.println(cents + " x 1c");
		}
	
		
		

	}

}
