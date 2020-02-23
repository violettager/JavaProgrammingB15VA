package day46_inheritance_intro;

public class Electronics extends Device {
    public static void main(String[] args) {
Device device = new Device();
        device.brand = "LG";
        device.price = 900;
        device.country = "South Korea";
        device.use();
        System.out.println();


        TV t1 = new TV();
        t1.brand = "Samsung";
        t1.price = 1.799;
        t1.country = "Japan";
        t1.isSmart = true ;
        t1.screenSize = 65.0;
         t1.use();
         t1.watch();
        System.out.println();

        Phone p1 = new Phone();
        p1.brand = "Apple";
        p1.price = 999.0;
        p1.country = "USA";

        p1.carrier = "Verizon";

         p1.use();

         p1.call();
         p1.text("Hello");


    }
}