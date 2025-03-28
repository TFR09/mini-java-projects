package week6.issues;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
    ArrayList<String> a; 
    ArrayList<String> b;
    a = new ArrayList<>();
    b = a;
    a.add("Jam");
    b.add("Spam");
    
    if (a==b) {
        System.out.println("ArrayLists are equal");
    } else {
        System.out.println("ArrayLists are not equal");
    }

    System.out.println("a.get(0) = " + a.get(0));
    System.out.println("b.get(0) = " + b.get(0));
    }
}
