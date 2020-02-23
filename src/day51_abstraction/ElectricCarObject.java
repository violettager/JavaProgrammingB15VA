package day51_abstraction;

public class ElectricCarObject {
    public static void main(String[] args) {
       // ElectricCar car = new ElectricCar() {}
        Tesla models = new Tesla();
        models.charge();
        models.start();
        models.stop();

        Ford f1  = new Ford();
        f1.charge();
        f1.start();

        TeslaSemi semi = new TeslaSemi();
        semi.charge();
        semi.start();
        semi.load("potatoes");
        semi.drive();
        semi.stop();

        TeslaTruck teslaTruck = new TeslaTruck();
        teslaTruck.model = "Cyber Truck";
        teslaTruck.color = "Silver";
        teslaTruck.price = 453.999;
        teslaTruck.drive();
        teslaTruck.stop();
        System.out.println(teslaTruck.model);
        System.out.println(teslaTruck.toString());




    }
}
