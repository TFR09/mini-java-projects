package week8.meals;

import java.util.ArrayList;

public class Meal implements Ingredients,IPrice {
    private String name;
    private ArrayList<Ingredient> ingredients;
    
    public Meal(String name){
        this.name = name;
        ingredients = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void addIngredient(Ingredient i){
        ingredients.add(i);
    }
    
    public Ingredient removeIngredient(String name){
        for (Ingredient i : ingredients){
            if (i.getName().equalsIgnoreCase(name)){
                ingredients.remove(i);
                return i;
            }
        }
        return null;
    }

    public double getPrice(){
        double total = 0;
        for (Ingredient i: ingredients){
            total += i.getPrice();
        }
        return total;
    }
}