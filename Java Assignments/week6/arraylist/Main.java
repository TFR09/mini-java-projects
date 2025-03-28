package week6.arraylist;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println("Array Lists");
        
        ArrayList <String> list = new ArrayList<>();
        list.add("Jam");
        list.add("Spam");
        list.add("Cat");
        list.add("Map");

        for (int i = 0; i< list.size(); i++){
        System.out.println(list.get(i));
        }
    }
}
