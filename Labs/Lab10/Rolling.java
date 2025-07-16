//Evelyn Sun
//115417946

import java.util.Scanner;

public class Rolling {
	public static void main (String args[]) {

		int x = (int)(1+Math.random()*6);
		System.out.println("The first die comes up "+ x);
		int y = (int)(1+Math.random()*6);
		System.out.println("The second die comes up " + y);
		int total=x+y;
		System.out.println("Your total roll is " + total);
		
		
	}
	

}
