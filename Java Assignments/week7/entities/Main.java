package week7.entities;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Entity> middleEarth = new ArrayList();
        Entity e = new Hobbit("Frodo");
        e.setPosition(3,4);
        middleEarth.add(e);
        e = new Hobbit("Bilbo");
        e.setPosition(10,25);
        middleEarth.add(e);
        middleEarth.add(new Wizard("Gandalph", 250));

        for (Entity entity: middleEarth){
            System.out.println(entity.toString());
        }

        for (Entity entity: middleEarth){
            entity.move();
            System.out.println(entity.toString());
        }
    }
}
