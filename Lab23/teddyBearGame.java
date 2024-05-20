//Evelyn Sun
//115417946

public class teddyBearGame {
	public static boolean teddyBearGame(int initial, int goal, int increment, int maxStep) {
		System.out.print("initial: " + initial + " | ");
		System.out.print("goal: " + goal + " | ");
		System.out.print("increment: " + increment + " | ");
		System.out.print("maxStep: " + maxStep + " | ");
		if (initial==goal) {
			System.out.println("return true");
			return true;
		}
		else if (maxStep==0&&initial!=goal) {
			System.out.println("return false");
			return false;
		}
		if (initial%2!=0) {
			System.out.println("called : " + (increment+initial));
			return teddyBearGame(initial+increment, goal, increment, maxStep-1);
		}
		else {
			System.out.println("called : " + (increment+initial)+ " and " + initial/2);
			return teddyBearGame(initial+increment,goal, increment, maxStep-1)||teddyBearGame(initial/2,goal,increment,maxStep-1);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(teddyBearGame(99,91,53,4));

	}

}
