//Evelyn Sun

//115417946

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class TestRecipeBook {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingredient i = new Ingredient("Milk", "liters", 20);
		Ingredient i2 = new Ingredient("Sugar","grams",10);
		Ingredient i3 = new Ingredient("Condensed Milk", "liters", 20);
		Ingredient i4  = new Ingredient("Vanilla Extract","teaspoons", 3);
		Ingredient i5  = new Ingredient("Brown Sugar","grams", 30);
		
		
		
		System.out.println("Ingredient One's Name " + i.getIngredientName());
		System.out.println("Ingredient One's Measuring Unit: " +  i.getMeasuringUnit());
		System.out.println("Ingredient One's Calories Per Unit: " + i.getCaloriesPerUnit());
		
		System.out.println("Ingredient One's Description: \n" + i.toString());
		
		System.out.println();

		System.out.println("Ingredient Two's Name: " + i2.getIngredientName());
		System.out.println("Ingredient Two's Measuring Unit: " +  i2.getMeasuringUnit());
		System.out.println("Ingredient Two's Calories Per Unit: " + i2.getCaloriesPerUnit());
		
		System.out.println("Ingredient Two's Description: \n" + i2.toString());
		
		System.out.println();
		
		System.out.println("Ingredient Three's Name: " + i3.getIngredientName());
		System.out.println("Ingredient Three's Measuring Unit: " +  i3.getMeasuringUnit());
		System.out.println("Ingredient Three's Calories Per Unit: " + i3.getCaloriesPerUnit());
		
		System.out.println("Ingredient Three's Description: \n" + i3.toString());
		
		System.out.println();
		
		System.out.println("Ingredient Four's Name: " + i4.getIngredientName());
		System.out.println("Ingredient Four's Measuring Unit: " +  i4.getMeasuringUnit());
		System.out.println("Ingredient Four's Calories Per Unit: " + i4.getCaloriesPerUnit());
		
		System.out.println("Ingredient Four's Description: \n" + i4.toString());
		
		System.out.println();
		
		System.out.println("Ingredient Five's Name: " + i5.getIngredientName());
		System.out.println("Ingredient Five's Measuring Unit: " +  i5.getMeasuringUnit());
		System.out.println("Ingredient Five's Calories Per Unit: " + i5.getCaloriesPerUnit());
		
		System.out.println("Ingredient Five's Description: \n" + i5.toString());
		
		System.out.println();
		
		
		
		System.out.println("Does Ingredient one equal Ingredient two? "+i.equals(i2));
		System.out.println("Does Ingredient one equal Ingredient three? "+i.equals(i3));
		
		System.out.println();
		
		RecipeIngredient ri = new RecipeIngredient("Milk", "liters", 20,10);
		RecipeIngredient ri2 = new RecipeIngredient("Eggs", "quantity", 30,3);
		RecipeIngredient ri3 = new RecipeIngredient("Sugar", "Grams", 10,10);
		RecipeIngredient ri4 = new RecipeIngredient("Flour", "grams", 40,100);
		RecipeIngredient ri5 = new RecipeIngredient("Bread", "loaf", 70,1);
		RecipeIngredient ri6 = new RecipeIngredient("Cheese", "slices", 30,2);
		RecipeIngredient ri7 = new RecipeIngredient("Butter", "slices", 80,5);
		RecipeIngredient ri8 = new RecipeIngredient("Pepper", "grams", 30,50);
		
		System.out.println("Recipe Ingredient One's Name: " + ri.getIngredientName());
		System.out.println("Recipe Ingredient One's Measuring Unit: " + ri.getMeasuringUnit());
		System.out.println("Recipe Ingredient One's Calories Per Unit: " + ri.getCaloriesPerUnit());
		System.out.println("Recipe Ingredient One's Quantity: " + ri.getQuantity());
		
		System.out.println("Recipe Ingredient One's Description: \n"  + ri.toString());
		
		System.out.println();
		
		System.out.println("Recipe Ingredient Two's Name: " + ri2.getIngredientName());
		System.out.println("Recipe Ingredient Two's Measuring Unit: " + ri2.getMeasuringUnit());
		System.out.println("Recipe Ingredient Two's Calories Per Unit: " + ri2.getCaloriesPerUnit());
		System.out.println("Recipe Ingredient Two's Quantity: " + ri2.getQuantity());
		
		System.out.println("Recipe Ingredient Two's Description: \n"  + ri2.toString());
		
		System.out.println();
		
		System.out.println("Recipe Ingredient Three's Name: " + ri3.getIngredientName());
		System.out.println("Recipe Ingredient Three's Measuring Unit: " + ri3.getMeasuringUnit());
		System.out.println("Recipe Ingredient Three's Calories Per Unit: " + ri3.getCaloriesPerUnit());
		System.out.println("Recipe Ingredient Three's Quantity: " + ri3.getQuantity());
		
		System.out.println("Recipe Ingredient Three's Description: \n"  + ri3.toString());
		
		
		System.out.println();
		
		System.out.println("Recipe Ingredient Four's Name: " + ri4.getIngredientName());
		System.out.println("Recipe Ingredient Four's Measuring Unit: " + ri4.getMeasuringUnit());
		System.out.println("Recipe Ingredient Four's Calories Per Unit: " + ri4.getCaloriesPerUnit());
		System.out.println("Recipe Ingredient Four's Quantity: " + ri4.getQuantity());
		
		System.out.println("Recipe Ingredient Four's Description: \n"  + ri4.toString());
		
		
		System.out.println();
		
		System.out.println("Recipe Ingredient Five's Name: " + ri5.getIngredientName());
		System.out.println("Recipe Ingredient Five's Measuring Unit: " + ri5.getMeasuringUnit());
		System.out.println("Recipe Ingredient Five's Calories Per Unit: " + ri5.getCaloriesPerUnit());
		System.out.println("Recipe Ingredient Five's Quantity: " + ri5.getQuantity());
		
		System.out.println("Recipe Ingredient Five's Description: \n"  + ri5.toString());
		
		
		System.out.println();
		
		System.out.println("Recipe Ingredient Sixth Name: " + ri6.getIngredientName());
		System.out.println("Recipe Ingredient Sixth Measuring Unit: " + ri6.getMeasuringUnit());
		System.out.println("Recipe Ingredient Sixth Calories Per Unit: " + ri6.getCaloriesPerUnit());
		System.out.println("Recipe Ingredient Sixth Quantity: " + ri6.getQuantity());
		
		System.out.println("Recipe Ingredient Sixth Description: \n"  + ri6.toString());
		
		
		System.out.println();
		
		System.out.println("Recipe Ingredient Seventh Name: " + ri7.getIngredientName());
		System.out.println("Recipe Ingredient Seventh Measuring Unit: " + ri7.getMeasuringUnit());
		System.out.println("Recipe Ingredient Seventh Calories Per Unit: " + ri7.getCaloriesPerUnit());
		System.out.println("Recipe Ingredient Seventh Quantity: " + ri7.getQuantity());
		
		System.out.println("Recipe Ingredient Seventh Description: \n"  + ri7.toString());
		
		System.out.println();
		
		System.out.println("Recipe Ingredient Eighth's Name: " + ri8.getIngredientName());
		System.out.println("Recipe Ingredient Eighth Measuring Unit: " + ri8.getMeasuringUnit());
		System.out.println("Recipe Ingredient Eighth Calories Per Unit: " + ri8.getCaloriesPerUnit());
		System.out.println("Recipe Ingredient Eighth Quantity: " + ri8.getQuantity());
		
		System.out.println("Recipe Ingredient Eighth Description: \n"  + ri8.toString());
		
		System.out.println();
		
		
	
		System.out.println("Update Recipe Ingredient One's Quantity to 5");
		ri.setFloatQuantity(5);
		System.out.println("Recipe Ingredient One's New Quantity: " + ri.getQuantity());
		System.out.println("Recipe Ingredient One's New Description: \n" + ri.toString());
		
		System.out.println();
		
		ArrayList<RecipeIngredient> hi = new ArrayList<RecipeIngredient>();
		hi.add(ri);
		hi.add(ri2);
		hi.add(ri3);
		hi.add(ri4);
		
		System.out.println("Creating a new Cooking Recipe called Cake with Milk, Eggs, Sugar and Flour");
		CookingRecipe c = new CookingRecipe("Cake", hi);
		System.out.println();
		System.out.println("Adding an ingredient of Brown Sugar with the Quantity of 1");
		c.addOrUpdateRecipeIngredient(i5, 1);
		
		System.out.println();
		
		System.out.println("Cooking Recipe Name: " + c.getCookingRecipeName());
		System.out.println("Recipe Ingredients: \n" + c.getRecipeIngredients());
		System.out.println("Get Ingredient for Vanilla Extract: " +  c.getRecipeIngredient(i4));
		System.out.println("Get Ingredient for Milk: " +  c.getRecipeIngredient(i3));
		System.out.println("Get Ingredient for Sugar: " + c.getRecipeIngredient("Sugar"));
		System.out.println("Removing Ingredient Sugar: " + c.removeRecipeIngredient(i3));
		System.out.println("Removing Ingredient Eggs: " + c.removeRecipeIngredient("Eggs"));
		System.out.println("Total Calories of Recipe: " + c.calculateCalories());
		System.out.println("Total number of ingredienets: " + c.getNumberOfIngredients());
		System.out.println("Cooking Recipe Description: \n" + c.toString());
		
	
	
		
		System.out.println();
		
		RecipeIngredient[] hi22 = {ri5,ri6};
		ArrayList<RecipeIngredient> hi2 = new ArrayList<RecipeIngredient>();
		RecipeIngredient[] hi33 = {ri7,ri8};
		
		ArrayList<RecipeIngredient> idk = c.getRecipeIngredients();
		RecipeIngredient[]idk2 = new RecipeIngredient[idk.size()];
		for (int k=0;k<idk.size();k++) {
			idk2[k]=idk.get(k);
		}
		
		System.out.println("Creating a Recipe Book");
		System.out.println();
		RecipeBook rb = new RecipeBook("Evelyn's Favorite Recipes");
		System.out.println("Recipe Book Name: " + rb.getBookName()); 
		System.out.println();
		System.out.println("Adding Grilled Cheese Recipe");
		rb.addRecipe("Grilled Cheese",hi22);
		System.out.println();
		System.out.println("Adding Cake Recipe");
		rb.addRecipe("Cake", idk2);
		System.out.println();
		System.out.println("Recipe Book Description: \n" + rb.toString());
		System.out.println();
		
		
		
		System.out.println("Finding Recipes with Butter and Pepper: " + Arrays.toString(rb.findRecipes(hi33)));
		
		System.out.println("Finding Recipes with Only Two Ingredients: \n" + Arrays.toString(rb.findRecipesWithFewIngredients(2)));
		
		System.out.println("Finding Recipes with Low Calories: \n" + Arrays.toString(rb.findRecipesLowCalories()));
		
		
		
		
	
	
	
	
		
	
		
		
				
		
		
		
		

	}

}
