//Evelyn Sun
//115417946

public class Bicycle extends Vehicle {
	public Bicycle (String name){
		super(name,2);
	}
	public String toString() {
		return "Bicycle is a " + super.toString();
	}
	public boolean equals(Object other) {
		return super.equals(other);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
