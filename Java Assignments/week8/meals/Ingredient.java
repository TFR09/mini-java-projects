package week8.meals;

public class Ingredient implements IPrice {
    private String name;
    private double price;
  
    public Ingredient(String name, double price){
        this.name = name;
        this.price = price;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    public void setPrice(double p) {
        price = p;
    }
  
    public String getName(){
        return name;
    }
  
    public double getPrice(){
        return price;
    }
  }