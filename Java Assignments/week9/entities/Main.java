package week9.entities;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    static void menu() {
        System.out.println("Options are");
        System.out.println("1: Add Hobbit ");
        System.out.println("2: Add Wizard");
        System.out.println("3: Delete Entity by position in list");
        System.out.println("4: Move Entities");
        System.out.println("5: Reset");
        System.out.println("6: Display Grid");
        System.out.println("0: Stop");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        World world = new World("Middle Earth");
        Scanner scan = new Scanner(System.in);
        int option;

        world.loadEntities("middleEarth.txt");
      
        menu();
        System.out.print("Enter an option: ");
        option = scan.nextInt();
        
      
        while (option !=0) {
            switch(option) {
                case 1:
                    System.out.print("Enter the name of the Hobbit: ");
                    String name = scan.next();
                    Hobbit hob = new Hobbit(name);
                    hob.reset();
                    world.addEntity(hob);

                    break;
                case 2:
                    System.out.print("Enter the name of the wizard: ");
                    String nameW = scan.next();
                    System.out.print("Enter the age: ");
                    
                    int age = scan.nextInt();
                    Wizard wiz = new Wizard(nameW, age);
                    wiz.reset();

                    world.addEntity(wiz);
                    break;

                case 3:
                    System.out.print("Enter Position in list: ");
                    int pos = scan.nextInt();
                    world.removeEntity(pos);
                    break;
                case 4:
                    world.move();
                    break;
                case 5:
                    world.reset();
                    break;
                case 6:
                      System.out.println(world.representation());
                    break;
                default:
                    System.out.println("Error");
            }

            menu();
            System.out.print("Enter an option: ");
            option = scan.nextInt();
        }
    }
}
