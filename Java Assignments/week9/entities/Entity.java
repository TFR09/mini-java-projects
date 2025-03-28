package week9.entities;

public abstract class Entity implements Positionable {
    private String name;
    private String symbol;
    private Point position;
  
    public Entity(String name){
        this.name = name;
        position = new Point();
        symbol = "";
    }
    
    public void setName(String n){
        name = n;
    }
  
    public void setSymbol(String s){
        symbol = s;
    }
    
    public void setPosition(Point pos){
        position = pos;
    }
  
    public void setPosition(int x, int y){
        position = new Point(x, y);
    }
  
    public String getName() {
        return name;
    }
  
    public String representation() {
        return symbol;
    }
  
    public Point getPosition() {
        return position;
    }
  
    public String toString(){
        String s = "Entity " + name + " Position " + position.toString();
        return s;
    }
  
    public abstract void move();
  
    public void reset(){
        position = new Point(0, 0);
    }
}