// Evelyn Sun (115417946)


import java.util.*;
import java.io.*;
import java.util.Scanner.*;



public class Celsius2Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner (System.in);
		System.out.print("Enter a degree in Celsius: ");
		double c = Kb.nextDouble();
		double f = (9.0/5)*c+32;
		System.out.println((int)(c)+ " in Celsius is " + f + " in Fahrenheit");

		

	}

}
