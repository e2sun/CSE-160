//Evelyn Sun
//115417946
import java.util.Scanner;


public class PremiumAirlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		Scanner Kc = new Scanner(System.in);
		
		System.out.print("Please enter membership (Diamond/Platinum/Regular): ");
		String membership = Kb.nextLine();
		

		System.out.print("Please enter ticket price: ");
		int price = Kc.nextInt();
		System.out.print("Please enter current points: ");
		int current_points = Kc.nextInt();
		int add = 0;
		
		if ((membership.equalsIgnoreCase("Diamond")||membership.equalsIgnoreCase("Platinum")) && (price>=5000)) {
			add = 35;
		}
		else if (membership.equalsIgnoreCase("Diamond")&&price>=2000 && current_points>300) {
			add = 30;
		}
			
		else if (membership.equalsIgnoreCase("Platinum")&& (price>=2000)) {
			add  = 20;
		}
		else if (membership.equalsIgnoreCase("Diamond")&& price>=500 && current_points>=100) {
			add = 10;
		}
		else if (membership.equalsIgnoreCase("Regular")&&price>=5000) {
			add = 5;
		}
		else if (membership.equalsIgnoreCase("Diamond") && current_points>=25) {
			add = 2;
		}
		
		else {
			add = 0;
		}
		
		if (!(membership.equalsIgnoreCase("Diamond"))||!(membership.equalsIgnoreCase("Regular"))||!(membership.equalsIgnoreCase("Platinum"))) {
			System.out.println("Invalid Input");
		}
		
		System.out.println("Points: " + (current_points + add));

	}

}
