//Evelyn Sun
//115417946

public class LiquidFood extends Food {
	private double viscosity;
	public LiquidFood(String description, int caloriesPerServing, double viscosity) {
		super(description,caloriesPerServing);
		this.viscosity=viscosity;
	}
	public double getViscosity() {
		return viscosity;
	}
	public void setViscosity(double viscosity) {
		this.viscosity=viscosity;
	}
	public String toString() {
		return "LiquidFood is a " + super.toString() + " and viscosity of " + viscosity;
	}
	public boolean equals(LiquidFood lf) {
		return super.equals(lf)&&viscosity==lf.getViscosity();
		
	}
	public int numCalories(int servings) {
		return super.getCaloriesPerServing()*servings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
