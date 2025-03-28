package week4.carManagement;

public class Person {
    private String name;
    private String address;
    private int age;
    private int numVehicles = 0;// max 5
    private Vehicle[] vehicles = new Vehicle[5];// max 5

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name);
        System.out.println(address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumVehicles(int num) {
        numVehicles = num;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getNumVehicles() {
        return numVehicles;
    }

    public Vehicle getVehicle(String plate) {
        for (int i = 0; i < numVehicles; i++) {
            if (vehicles[i].getPlate().equals(plate)) {
                return vehicles[i];
            }
        }
        return null;
    }

    public void addVehicle(Vehicle v) {
        vehicles[numVehicles] = v;
        numVehicles++;
    }

    public void display() {
        for (int i = 0; i < numVehicles; i++) {
            System.out.println(vehicles[i].getPlate());
        }
    }
}

