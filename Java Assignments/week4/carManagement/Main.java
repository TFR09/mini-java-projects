package week4.carManagement;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name = kb.next();
        int age = kb.nextInt();
        String address = kb.next();
        Person person1 = new Person(name,age);
        person1.setAddress(address);
        int cars = kb.nextInt();

        String maker, model, plate;
        
        //add first vehicle
        maker = kb.next();
        model = kb.next();
        plate = kb.next();
        Vehicle v1 = new Vehicle(maker,model);
        v1.setPlate(plate); 
        person1.addVehicle(v1); 
        v1.setOwner(person1);

        //add second vehicle
        maker = kb.next();
        model = kb.next();
        plate = kb.next();
        Vehicle v2 = new Vehicle(maker,model);
        v2.setPlate(plate); 
        person1.addVehicle(v2); 
        v2.setOwner(person1);
        
        plate = kb.next();
        Vehicle v = person1.getVehicle(plate);

        if (v == null) {
            System.out.println("error");
        }
        else {
            maker = v.getMaker();
            model = v.getModel();
            System.out.println(maker);
            System.out.println(model);
        }
    }
}