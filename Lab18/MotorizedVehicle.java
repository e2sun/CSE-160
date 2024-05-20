//Evelyn Sun
//115417946

public class MotorizedVehicle extends Vehicle {
	private double engineVolumeDisplacement;
	public MotorizedVehicle(String name, int wheels, double engineVolumeDisplacement) {
		super(name,wheels);
		this.engineVolumeDisplacement=engineVolumeDisplacement;
	}
	public double getEngineVolumeDisplacement() {
		return engineVolumeDisplacement;
	}
	public void setEngineVolumeDisplacement(double engineVolumeDisplacement) {
		this.engineVolumeDisplacement=engineVolumeDisplacement;
	}
	public double horsePower() {
		return engineVolumeDisplacement*super.getWheels();
	}
	public String toString() {
		return "Motorized Vehicle is a " + super.toString() + " and " + engineVolumeDisplacement + " liters of engine volume displacement";
	}
	public boolean equals(MotorizedVehicle mv) {
		return super.equals(mv)&&engineVolumeDisplacement==mv.getEngineVolumeDisplacement();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
