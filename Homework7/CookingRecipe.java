//Evelyn Sun
//115417946

import java.util.ArrayList;

public class CookingRecipe {
	private String name;
	private ArrayList<RecipeIngredient> RecipeIngredients = new ArrayList<RecipeIngredient>(); 
	
	public CookingRecipe(String name) {
		this.name=name;
	}
	public CookingRecipe(String name, ArrayList<RecipeIngredient> RecipeIngredients) {
		this.name=name;
		this.RecipeIngredients=RecipeIngredients;
	}
	public String getCookingRecipeName() {
		return name;
	}
	public ArrayList<RecipeIngredient> getRecipeIngredients(){
		return RecipeIngredients; 
	}
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		for (int i=0;i<RecipeIngredients.size();i++) {
			if (ingredient.getIngredientName().equals(RecipeIngredients.get(i).getIngredientName())) {
				RecipeIngredients.get(i).setFloatQuantity(quantity);
				
			}
		}
			
		RecipeIngredients.add(new RecipeIngredient (ingredient,quantity));
			
			
		
	}
		
		
		
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for (int i=0;i<RecipeIngredients.size();i++) {
			if (RecipeIngredients.get(i).getIngredientName().equals(ingredient.getIngredientName())
					&&RecipeIngredients.get(i).getMeasuringUnit().equals(ingredient.getMeasuringUnit())
					&&RecipeIngredients.get(i).getCaloriesPerUnit()==ingredient.getCaloriesPerUnit()){
				return RecipeIngredients.get(i);
			}
		}
		return null;
		
	}
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for (int i=0;i<RecipeIngredients.size();i++) {
			if (ingredientName.equals(RecipeIngredients.get(i).getIngredientName())){
				return RecipeIngredients.get(i);
			}
			
		
			
		}
		return null;
		
	}
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {

		String s = ingredient.getIngredientName();
		int j=0;
		for (int i=0;i<RecipeIngredients.size();i++) {
			if (s.equals(RecipeIngredients.get(i).getIngredientName())&&RecipeIngredients.get(i).getMeasuringUnit().equals(ingredient.getMeasuringUnit())
					&&RecipeIngredients.get(i).getCaloriesPerUnit()==ingredient.getCaloriesPerUnit()) {
				j=i;
			}
		}
		return RecipeIngredients.remove(j);
		
	}
	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		//int j=0;
		for (int i=0;i<RecipeIngredients.size();i++) {
			if (ingredientName.equals(RecipeIngredients.get(i).getIngredientName())) {
				return RecipeIngredients.remove(i);
			}
		}
		return null;
		
	}
	public float calculateCalories() {
		float sum = 0;
		for (int i=0;i<RecipeIngredients.size();i++) {
			sum +=(float) RecipeIngredients.get(i).getCaloriesPerUnit();
		}
	
		return sum;
	}
		
	
	public int getNumberOfIngredients() {
		return RecipeIngredients.size();

	}
	public String toString() {
		
	String s = "Recipe Name: " + name + "\n" + "Ingredients: ";
	for (int i = 0; i < RecipeIngredients.size(); i++) {
	    s += RecipeIngredients.get(i).getIngredientName();
	    if (i < RecipeIngredients.size() - 1) {
	        s += ", ";
	    }
	}

	return s;
	}
		
	
	public boolean equals(Object o) {
		if (o instanceof CookingRecipe) {
			CookingRecipe c1 = (CookingRecipe)o;
			return (c1.getCookingRecipeName().equals(name)&&c1.getRecipeIngredients()==RecipeIngredients);
		}
			
		return false;
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
