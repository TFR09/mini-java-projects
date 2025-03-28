package week3.objectsArray;

import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
        System.out.println("Array of Objects");
        int area = getTotalArea(fillDimensions());
        System.out.println("Total area: "+ area);
    }
    public static Rectangle[] fillDimensions()
    {
        Scanner kb = new Scanner(System.in);
        Rectangle[] house = new Rectangle[5];
        for (int i = 1, l = house.length; i <= l; i++){
            System.out.println("Enter length for room "+ i);
            int length = kb.nextInt();
            System.out.println("Enter width for room "+ i);
            int width = kb.nextInt();
            house[i-1] = new Rectangle(length, width);
        }
        return house;
    }
    public static int getTotalArea(Rectangle[] house)
    {
        int total = 0;
        for (int i = 0, l = house.length; i < l; i++) {
            total += house[i].getArea();
        }
        return total;
    }
}
