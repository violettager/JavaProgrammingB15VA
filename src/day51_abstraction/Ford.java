package day51_abstraction;

public class Ford extends ElectricCar {
    @Override
    public void start() {
        System.out.println("Ford - push Start button to start...");
    }

    @Override
    public void charge() {
        System.out.println("Ford   - plugin to Electric outlet");

    }
    public void drive(){
        System.out.println("Ford is driving...");
    }
}
