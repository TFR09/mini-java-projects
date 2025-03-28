package week3.rectangle;

public class Rectangle {
    public int length;
    public int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        int area = length * width;
        return area;
    } 

    public int getPerimeter(){
        int perimeter = 2*(length + width);
        return perimeter;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }
  }