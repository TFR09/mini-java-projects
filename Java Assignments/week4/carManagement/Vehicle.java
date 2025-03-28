package week4.carManagement;

public class Vehicle {
    private String maker;
    private String model;
    private String plate;
    private Person owner;//max 1 owner

    public Vehicle(String maker, String model){
        this.maker = maker;
        this.model = model;
    }
    
    public void getInfo(){
        System.out.println(maker);
        System.out.println(model);
        System.out.println(plate);
    }
    
    public void setMaker(String maker){
        this.maker = maker;
    }
    
    public void setModel(String model){
        this.model = model;
    }

    public void setPlate(String plate){
        this.plate = plate;
    }

    public void setOwner(Person p){
        owner = p;
    }

    public String getMaker(){
        return maker;
    }

    public String getModel(){
        return model;
    }

    public String getPlate(){
        return plate;
    }

    public Person getOwner(){
        return owner;
    }
}
