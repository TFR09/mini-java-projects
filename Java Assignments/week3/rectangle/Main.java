package week3.rectangle;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Rectangle");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = kb.nextInt();
        System.out.println("Enter the width: ");
        int width = kb.nextInt();
        Rectangle box = new Rectangle(length, width);
        int area = box.getArea();
        int peri = box.getPerimeter();
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ peri);
    }
}