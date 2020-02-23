package day51_abstraction;

public  class Tesla extends ElectricCar {
    public void start(){
        //public abstract void charge
        System.out.println("tesla is starting quietly ");
        System.out.println("change to drive mode...");
    }
    //public abstract void charge
    public void charge(){
        System.out.println("Tesla charging : plugin to electrical outlet ");
    }
    public void drive(){
        System.out.println("tesla  is driving...");
    }
    public void stop(){
        System.out.println("tesla is stopping by pushing the  break...");
    }
}
