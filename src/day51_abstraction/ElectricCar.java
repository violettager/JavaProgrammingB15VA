package day51_abstraction;

public abstract  class ElectricCar {
    String model;
    double price;
    String color;
public abstract void start(); //what todo , instead how todo. hide implementation, not adding any method to the body
    public abstract void charge();
    public abstract void drive();

    public void stop(){
        System.out.println("Electric car is stoping by pushing the  break...");
    }



}
