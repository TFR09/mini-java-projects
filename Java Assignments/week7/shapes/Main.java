package week7.shapes;

import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Options are");
        System.out.println("1: Add Circle ");
        System.out.println("2: Add Rectangle");
        System.out.println("3: Delete Shape by position in list");
        System.out.println("4: Display Shapes");
        System.out.println("5: translate Shapes");
        System.out.println("0: Stop");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shapes myShapes = new Shapes();
        Scanner scan = new Scanner(System.in);
        int option;

        menu();
        System.out.println("Enter an option");
        option = scan.nextInt();

        while (option !=0) {
            switch(option) {
                case 1:
                    System.out.println("Enter the radius");
                    int r = scan.nextInt();
                    myShapes.addShape(new Circle(r));
                    break;
                case 2:
                    System.out.println("Enter the width");
                    int w = scan.nextInt();
                    System.out.println("Enter the length");
                    int l = scan.nextInt();
                    myShapes.addShape(new Rectangle(w,l));
                    break;

                case 3:
                    System.out.println("Enter Position in list");
                    int pos = scan.nextInt();
                    myShapes.removeShape(pos);
                    break;
                case 4:
                    System.out.println(myShapes.toString());
                    break;
                case 5:
                    System.out.println("Enter x translation ");
                    int x = scan.nextInt();
                    System.out.println("Enter y translation ");
                    int y = scan.nextInt();
                    myShapes.translate(x,y);
                    System.out.println(myShapes.toString());
                    break;
                default:
                    System.out.println("Error");
            }
            menu();
            System.out.println("Enter an option");
            option = scan.nextInt();
        }
    }
}
