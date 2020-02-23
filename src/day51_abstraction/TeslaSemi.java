package day51_abstraction;

public class TeslaSemi extends ElectricTruck {
    @Override
    public void load(String items) {
        System.out.println("TeslaSemi - load "+items+" by lowering the truck and opening door...");
    }

    @Override
    public void start() {
        System.out.println("TeslaSemi - start truck by pressing button.. ");
    }

    @Override
    public void charge() {
        System.out.println("TeslaSemi - plugin charge for one day...");

    }

    @Override
    public void drive() {
        System.out.println("TeslaSemi  - drive with load...");

    }
    public void stop(){
        System.out.println("TeslaSemi - is stoping by pushing the  break...");
    }
}
