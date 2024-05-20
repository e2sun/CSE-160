
// Evelyn Sun (115417946)


import java.util.*;
import java.io.*;
import java.util.Scanner.*;


public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner (System.in);
		System.out.print("Fixed Price: $");
		double fp = Kb.nextDouble();
		System.out.print("Quantity: ");
		int q = Kb.nextInt();
		double discount=0;

		if (q>1||q<6){
			discount = 0.20;
		} else if (q>5||q<11){
			discount = 0.30;
		} else if (q>11){
			discount = 0.40;
		}
		
		System.out.println("Discount: " + (int)(discount*100) + "%");
		System.out.println("Discounted price: $" + (fp-(fp*discount)) + " with discounted amount per unit: $" + (fp*discount) + " from the original price of $" + fp);
		System.out.println("Final total price: $" + (fp-(fp*discount)) + " * " + (q) + " = $" + (fp-(fp*discount)) * q);
	}



}


