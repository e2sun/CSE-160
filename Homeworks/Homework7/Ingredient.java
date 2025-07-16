//Evelyn Sun
//115417946

public class Ingredient {
	private String name, measuringUnit;
	int caloriesPerUnit;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name=name;
		this.measuringUnit=measuringUnit;
		this.caloriesPerUnit=caloriesPerUnit;
	}
	public String getIngredientName() {
		return name;
	}
	public String getMeasuringUnit() {
		return measuringUnit;
	}
	public double getCaloriesPerUnit() {
		return caloriesPerUnit;
	}
	public String toString() {
		return "Ingredient\n"+ "name=" + name + "\n" + "measuringUnit=" + measuringUnit + "\n" + "caloriesPerUnit=" + caloriesPerUnit;
	}
	public boolean equals(Object o) {
		if (o instanceof Ingredient) {
			Ingredient I1 = (Ingredient)o;
			return (I1.getIngredientName().equals(name)&&I1.getMeasuringUnit().equals(measuringUnit)&&I1.getCaloriesPerUnit()==caloriesPerUnit);
		}
			
		return false;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
