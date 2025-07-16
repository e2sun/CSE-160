//Evelyn Sun
//115417946

public class Fruit extends Food {
	private String season;
	public Fruit(String description, int caloriesPerServing, String season) {
		super(description,caloriesPerServing);
		this.season=season;
		
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season=season;
	}
	public String toString() {
		return "Fruit is a " +  super.toString() + " and a season of " + season;
	}
	public boolean equals(Fruit f) {
		return super.equals(f)&&season.equals(f.getSeason());
		
	}
	public int numCalories(int servings) {
		return super.getCaloriesPerServing()*servings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
