//Evelyn Sun
//115417946

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeBook  {
	private String bookName;
	private ArrayList<CookingRecipe> CookingRecipes = new ArrayList<CookingRecipe>();
	public RecipeBook(String bookName) {
		this.bookName=bookName;
		
	}
	
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		ArrayList<RecipeIngredient> RecipeIngredients = new ArrayList<RecipeIngredient>();
		for (int i=0;i<CookingRecipes.size();i++) {
			if (CookingRecipes.get(i).getCookingRecipeName().equals(name)){
				return null;
			}
		}
		for (int i=0;i<ingredients.length;i++) {
			RecipeIngredients.add(ingredients[i]);
		}
		CookingRecipe c1 = new CookingRecipe(name, RecipeIngredients);
		CookingRecipes.add(c1);
		return c1;
	}
	

	public String getBookName() {
		return bookName;
	}
	
	public ArrayList<CookingRecipe> getCookingRecipes() {
		return CookingRecipes;
	}
	public CookingRecipe removeRecipe(String name) {
		for (int i=0;i<CookingRecipes.size();i++) {
			if (CookingRecipes.get(i).getCookingRecipeName().equals((name))) {
				return CookingRecipes.remove(i);
			}
		}
		return null;
		
	}
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		int count=0;
		for (int i=0;i<CookingRecipes.size();i++) {
			if (CookingRecipes.get(i).getRecipeIngredients().contains(ingredients)) {
				count++;
				
			}
		}
		if (count==0) {
			return null;
		}
		CookingRecipe [] Recipes = new CookingRecipe[count];
		for (int i=0;i<CookingRecipes.size();i++) {
			if (CookingRecipes.get(i).getRecipeIngredients().contains(ingredients)) {
				Recipes[i]=CookingRecipes.get(i);
				
			}
		}
		return Recipes;
		
	}
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
	    int count = 0;
	    for (int i = 0; i < CookingRecipes.size(); i++) {
	        if (CookingRecipes.get(i).getNumberOfIngredients() <= numberOfIngredients) {
	            count++;
	        }
	    }

	    CookingRecipe[] RecipesWithFewIngredients = new CookingRecipe[count];
	    int index = 0; // Index for populating RecipesWithFewIngredients array
	    for (int i = 0; i < CookingRecipes.size(); i++) {
	        if (CookingRecipes.get(i).getNumberOfIngredients() <= numberOfIngredients) {
	            RecipesWithFewIngredients[index++] = CookingRecipes.get(i);
	        }
	    }

	    return RecipesWithFewIngredients;
	} 
	


	
	public CookingRecipe[] findRecipesLowCalories() {
	    float min = CookingRecipes.get(0).calculateCalories();
	    int count = 0;
	    
	   
	    for (CookingRecipe recipe : CookingRecipes) {
	        float calories = recipe.calculateCalories();
	        if (calories < min) {
	            min = calories;
	            count = 1; 
	        } else if (calories == min) {
	            count++; 
	        }
	    }
	    
	    
	    CookingRecipe[] RecipesLowCalories = new CookingRecipe[count];
	    int index = 0;
	    for (CookingRecipe recipe : CookingRecipes) {
	        if (recipe.calculateCalories() == min) {
	            RecipesLowCalories[index++] = recipe;
	        }
	    }
	    
	    return RecipesLowCalories;
	}

	
	public String toString() {
		return "Recipe Book Name: " + bookName;
		
	}
	
	
	public boolean equals(Object o) {
		if (o instanceof RecipeBook) {
			RecipeBook R1 = (RecipeBook)o;
			return (R1.getBookName().equals(bookName));
				
		}
			
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
