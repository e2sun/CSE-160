//Evelyn Sun
//115417946

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;
		
		for (int i=0; i<11;i++) {
			System.out.print("Tuition in " + i +  " years: ");
			System.out.printf("%.2f", tuition);
			System.out.println();
			tuition +=(0.05*tuition);
			
		}
		
		double total=0;
		for (int j=0;j<4;j++) {
			total+=tuition;
			tuition+=(0.05*tuition);
		}
		//System.out.printf("%s%.2f", "Tuition in 10 years: $",tuition);
		//System.out.println();
		System.out.printf("%s%.2f", "Four years worth of tuition after tenth year: $",total);
		
	}

}
