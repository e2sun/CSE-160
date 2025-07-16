//Evelyn Sun
//115417946

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Kb = new Scanner (System.in);
		System.out.print("Number of eggs in the order: ");
		int eggs = Kb.nextInt();
		int d = eggs/12;
		int r = eggs%12;
		
		System.out.printf("You ordered %d eggs. " + "That's %d dozen (%d x 12 = %d eggs) " + "at $3.25 per dozen (%d x $3.25 = $%.2f) "
		+ "and %d loose eggs at 45 cents (%d x 45c = $%.2f)" + " for a total of $%.2f " + "($%.2f + $%.2f = $%.2f)." , eggs, d, d, d*12, d, d*3.25, 
		r, r, r*0.45, d*3.25 + r*0.45 , d*3.25, r*0.45, d*3.25+r*0.45);
		
		
		
		
	}

}
