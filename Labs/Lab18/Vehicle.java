//Evelyn Sun
//115417946

public abstract class Vehicle {
	private String name;
	private int wheels;
	
	public Vehicle(String name, int wheels) {
		this.name=name;
		this.wheels=wheels;
	}
	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setWheels(int wheels) {
		this.wheels=wheels;
	}
	public String toString() {
		return "Vehicle owned by " + name  + " with " + wheels + " wheels";
	}
	public boolean equals(Vehicle v) {
		return name.equals(v.getName())&& wheels==v.getWheels()&&getClass()==v.getClass();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bicycle b1 = new Bicycle("John Doe");
		Bicycle b2 = new Bicycle("John Doe");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("Bicycle b1 equals Bicycle b2: " + b1.equals(b2));
		
		System.out.println();
		
		MotorizedVehicle m1 = new MotorizedVehicle("John Doe", 2,40);
		MotorizedVehicle m2 = new MotorizedVehicle("John Doe", 4,60);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println("MotorizedVehicle m1 horsepower: " + m1.horsePower());
		System.out.println("MotorizedVehicle m2 horsepower: " + m2.horsePower());
		System.out.println("MotorizedVehicle m1 equals Motorized Vehicle m2: " + m1.equals(m2));
		m2.setName("John Doe");
		m2.setWheels(2);
		m2.setEngineVolumeDisplacement(40);
		System.out.println("MotorizedVehicle m1 equals MotorizedVehicle m2 after change: " + m1.equals(m2));
		
		System.out.println();
		
		System.out.println("MotorizedVehicle m1 equals Bicycle b1 " + m1.equals(b1));
		
		

	}

}
