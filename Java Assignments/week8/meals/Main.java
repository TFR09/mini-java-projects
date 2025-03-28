package week8.meals;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Meal dinner = new Meal("My dinner");
        Scanner kb = new Scanner(System.in);
        System.out.println("How many ingredients for the meal?");
        int numIngredients = kb.nextInt();

        for (int i = 0; i<numIngredients; i++){
            System.out.println("Enter ingredient name");
            String name = kb.next();
            System.out.println("Enter ingredient price");
            double price = kb.nextDouble();
            dinner.addIngredient(new Ingredient(name,price));
        }

        System.out.println("Total : $"+dinner.getPrice());
    }
}