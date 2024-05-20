//Evelyn Sun
//115417946

import java.util.ArrayList;

public class RecipeIngredient extends Ingredient {
	private float quantity;
	//private ArrayList<RecipeIngredient> RecipeIngredients = new ArrayList<RecipeIngredient>(); 
;	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity=quantity;
		//recipeIngredients.add(new RecipeIngredient(name, measuringUnit, caloriesPerUnit, quantity));
		
		
	}
	public RecipeIngredient(Ingredient I, float quantity) {
		super(I.getIngredientName(), I.getMeasuringUnit(),I.caloriesPerUnit);
		this.quantity=quantity;
	}
	public void setFloatQuantity(float quantity) {
		this.quantity=quantity;
	}
	public float getQuantity() {
		return quantity;
	}
	
	
	public String toString() {
		String s = "Recipe Ingredient Quantity: " + quantity;
		return s;
		
	}
	public boolean equals(Object o) {
		if (o instanceof RecipeIngredient) {
			RecipeIngredient R1 = (RecipeIngredient)o;
			return (R1.getQuantity()==quantity);
		}
			
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
