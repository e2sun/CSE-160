//Evelyn Sun
//115417946

public abstract class Food {
	private String description;
	private int caloriesPerServing;
	
	public Food(String description,int caloriesPerServing) {
		this.description=description;
		this.caloriesPerServing = caloriesPerServing;
		
	}
	public String getDescription() {
		return description;
	}
	public int getCaloriesPerServing() {
		return caloriesPerServing;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public void setCalories(int caloriesPerServing) {
		this.caloriesPerServing=caloriesPerServing;
	}
	public abstract int numCalories(int servings);
	
	public int numberOfCalories(int servings) {
		return servings*caloriesPerServing;
	}
	public String toString() {
		return "Food with description: \"" + description + "\" and " + caloriesPerServing + " calories";
	}
	public boolean equals(Food f) {
		return description.equals(f.getDescription())&&caloriesPerServing==f.getCaloriesPerServing()&&getClass()==f.getClass();
		
	}
	public static void main (String args[]) {
		LiquidFood lf1 = new LiquidFood("Soda",150,1);
		LiquidFood lf2 = new LiquidFood("Water",0,1);
		System.out.println(lf1);
		System.out.println(lf2);
		System.out.println("3 servings of LiquidFood lf1 is " + lf1.numCalories(3) + " calories");
		System.out.println("LiquidFood lf1 equals LiquidFood lf2: " + lf1.equals(lf2));
		
		System.out.println();
		
		Fruit f1 = new Fruit("Apple", 5, "Fall");
		Fruit f2 = new Fruit("Mango", 50, "Summer");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("2 servings of Fruit f2 is " + f2.numCalories(2) + " calories");
		System.out.println("Fruit f1 equals Fruit f2: " + f1.equals(f2));
		
		
	
	}
}


