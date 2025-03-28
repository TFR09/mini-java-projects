package week9.entities;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class World implements Positionable {
    private String name;
    private ArrayList<Entity> entities;

    public World(String name){
        this.name = name;
        entities = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addEntity(Entity e){
        entities.add(e);
    }

    public Entity removeEntity(int pos){
        return entities.remove(pos);
    }

    public Entity getEntity(int pos) {
        return entities.get(pos);
    }

    public void loadEntities(String nameFile) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(nameFile);
        Scanner scan  = new Scanner(file);
        while (scan.hasNextLine()) {
            Entity e;
            String type, name;
            int age, x, y;
            type = scan.next();
            name = scan.next();
            if (type.equalsIgnoreCase("Wizard")){
                age = scan.nextInt();
                x = scan.nextInt();
                y = scan.nextInt();
                e = new Wizard(name, age);
                e.setPosition(x, y);
                addEntity(e);
            }
            else if (type.equalsIgnoreCase("Hobbit")){
                x = scan.nextInt();
                y = scan.nextInt();
                e = new Hobbit(name);
                e.setPosition(x, y);
                addEntity(e);
            }
        }
    }

    public String representation() {
        String s = "";
        for (Entity e: entities){
            s += e.representation() + ", ";
        }
        return s;
    }

    public void reset(){
        for (Entity e: entities){
            e.reset();
        }
    }

    public void move(){
        for (Entity e: entities){
            e.move();
        }
    }
}